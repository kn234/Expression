package expression;

public class Subtract extends Operation implements Expression {
    Expression a, b;

    public Subtract(Expression a, Expression b) {
        super(a,b);
    }

    @Override
    public int evaluate(int a) {
        return evaluatea(a) - evaluateb(a);
    }

    @Override
    public String toString() {
        return "(" + a.toString() + "-" + b.toString() + ")";
    }

    public boolean equals(Expression a) {
        return this.toString().equals(a.toString());
    }
}
