package expression;


public abstract class Operation implements Expression {
    Expression a, b;
    String action;


    public Operation(Expression a, Expression b, String ac) {
        this.a = a;
        this.b = b;
        this.action = ac;
    }

    public int evaluate(int a) {
        int evalA = this.a.evaluate(a);
        int evalB = this.b.evaluate(a);

        return calc(evalA, evalB);
    }

    abstract int calc(int a, int b);

    @Override
    public String toString() {
        return "(" + a.toString() + " " + action + " " + b.toString() + ")";
    }

    @Override
    public int hashCode() {
        return action.hashCode() + a.hashCode() * 13 + b.hashCode() * 111;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (this.getClass() == obj.getClass()) {
                if (action.equals(((Operation) obj).action)) {
                    return this.a.equals(((Operation) obj).a) && this.b.equals(((Operation) obj).b);
                } else {
                    return false;

                }
            }
        }

        return false;
    }
}
