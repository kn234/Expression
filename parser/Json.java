package expression.parser;


import expression.*;

public final class Json {
    public static Object parse(final String string) {
        return parse(new StringCharSource(string));
    }

    public static Object parse(CharSource source) {
        return new JsonParser(source).parse();
    }

    protected static class JsonParser extends BaseParser {

        public JsonParser(CharSource source) {
            super(source);
        }

        public Object parse() {
            skipWhiteSpace();
            final Object result = parseValue();
            skipWhiteSpace();
            if (!end()) {
                throw error("Expected");
            }
            return result;
        }

        public void skipWhiteSpace() {
            do {
            } while (take(' '));
        }

        private Object parseValue() {
            if (take('(')) {
                return parseExpression();
            } else if (take('"')) {
                return parseString();

            } else if (take('t')) {
                expect("rue");
                return true;
            } else if (take('f')) {
                expect("alse");
                return false;
            } else if (take('n')) {
                expect("ull");
                return null;
            } else {
                throw error("error value");
            }
        }

        protected String parseString() {
            StringBuilder result = new StringBuilder();
            while (!take('"')) {
                result.append(take());
            }
            return result.toString();
        }

        protected Expressions parseExpression() {
            Expressions result = null;
            skipWhiteSpace();
            while (!take(')')) {
                if (take('(')) {
                    Expressions in = parseExpression();
                    skipWhiteSpace();
                    char test = take();
                    result = selectionAction(test,in);

                } else {
                    char test = take();
                    skipWhiteSpace();
                    Expressions first;
                    if (Character.isDigit(test)) {
                        first = new Const(getNum(test));
                        skipWhiteSpace();
                        result = selectionAction(take(), first);
                        skipWhiteSpace();
                    } else if (Character.isAlphabetic(test)) {
                        first = new Variable(Character.toString(test));
                        skipWhiteSpace();
                        result = selectionAction(take(), first);
                        skipWhiteSpace();
                    } else {
                        throw error("Expected operation:");
                    }
                }
            }
            skipWhiteSpace();
            return result;

        }

        protected Expressions selectionAction(char action, Expressions in) {
            if (action == '+') {
                skipWhiteSpace();
                return secondElement(take(), "+", in);
            } else if (action == '-') {
                skipWhiteSpace();
                return secondElement(take(), "-", in);
            } else if (action == '*') {
                skipWhiteSpace();
                return secondElement(take(), "*", in);
            } else if (action == '/') {
                skipWhiteSpace();
                return secondElement(take(), "/", in);
            } else {
                throw error("(+, -, *, /)");
            }

        }

        protected Expressions createExpression(Expressions second, String action, Expressions in) {
            if (action.equals("+")) {
                return new Add(in, second);
            } else if (action.equals("-")) {
                return new Subtract(in, second);
            } else if (action.equals("*")) {
                return new Multiply(in, second);
            } else if (action.equals("/")) {
                return new Divide(in, second);
            } else {
                throw error("Expected operation in:");
            }
        }

        protected Expressions secondElement(char test, String action, Expressions in) {
            if (test == '(') {
                return createExpression(parseExpression(), action, in);
            } else if (Character.isDigit(test)) {
                Const digit = new Const(getNum(test));
                return createExpression(digit, action, in);
            } else if (Character.isAlphabetic(test)) {
                Variable var = new Variable(Character.toString(test));
                return createExpression(var, action, in);
            } else {
                throw error("Expected Const or Variable:");
            }
        }

        protected int getNum(char ch) {
            StringBuilder result = new StringBuilder(Character.toString(ch));
            while (isDigit()) {
                result.append(take());
            }
            return Integer.parseInt(result.toString());
        }

    }
}
