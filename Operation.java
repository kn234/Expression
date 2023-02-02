package expression;


public abstract class Operation implements Expression {
    Expression a, b;
    String action;


    public Operation(Expression a, Expression b, String ac) {
        this.a = a;
        this.b = b;
        this.action = ac;
    }

    public int evaluatea(int a) {
        return this.a.evaluate(a);
    }

    public int evaluateb(int a) {
        return b.evaluate(a);
    }

    public int add(int a) {
        return evaluatea(a) + evaluateb(a);
    }

    public int subtract(int a) {
        return evaluatea(a) - evaluateb(a);
    }

    public int multiply(int a) {
        return evaluatea(a) * evaluateb(a);
    }

    public int divide(int a) {
        return evaluatea(a) / evaluateb(a);
    }

    public int evaluate(int a) {
        if (action.equals("+")) {
            return add(a);
        } else if (action.equals("-")) {
            return subtract(a);
        } else if (action.equals("*")) {
            return multiply(a);
        } else {
            return divide(a);
        }
    }

    @Override
    public String toString() {
        return "(" + a.toString() + " " + action + " " + b.toString() + ")";
    }

    @Override
    public int hashCode() {
        return action.hashCode()+a.hashCode()*13+b.hashCode()*111;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (this.getClass()==obj.getClass()){
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
