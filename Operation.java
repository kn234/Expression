package expression;


public abstract class Operation implements Expression, TripleExpression {
    Operation a, b;
    String action;


    public Operation(Operation a, Operation b, String ac) {
        this.a = a;
        this.b = b;
        this.action = ac;
    }

    public Operation() {
    }

    public int evaluate(int x) {
        int evalA = this.a.evaluate(x);
        int evalB = this.b.evaluate(x);

        return calc(evalA, evalB);
    }

    abstract int calc(int a, int b);

    public int evaluate(int x, int y, int z) {
        int evalA = this.a.evaluate(x, y, z);
        int evalB = this.b.evaluate(x, y, z);

        return calc(evalA, evalB);
    }

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
