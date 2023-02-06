package expression.parser;

public class BaseParser {
    protected final CharSource source;
    protected char ch;
    protected static final char END = 0;

    public BaseParser(CharSource source) {
        this.source = source;
        take();
    }

    public boolean test(char expected) {
        return ch == expected;
    }

    public char take() {
        final char result = ch;
        ch = source.hasNext() ? source.next() : END;
        return result;
    }

    public boolean take(char expected) {
        if (ch == expected) {
            take();
            return true;
        } else {
            return false;
        }
    }

    public boolean isDigit() {
        return ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9';
    }


    protected void expect(final char expected) {
        if (!take(expected)) {
            throw error(String.format(
                    "Expected '%s', found '%s",
                    expected, ch));
        }
    }

    protected void expect(String string) {
        for (char ch : string.toCharArray()) {
            take(ch);
        }
    }

    protected IllegalArgumentException error(String message) {
        return source.error(message);
    }

    protected boolean end() {
        return test(END);
    }

}
