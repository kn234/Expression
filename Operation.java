package expression;

public abstract class Operation implements Expression {
    Expression a,b;

    public Operation(Expression a, Expression b) {
        this.a = a;
        this.b = b;
    }

    public int evaluatea(int a) {
        return this.a.evaluate(a);
    }

    public int evaluateb(int a) {
        return b.evaluate(a);
    }
}
