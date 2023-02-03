package expression;

public class Divide extends Operation implements Expression, TripleExpression {


    public Divide(Expression a, Expression b) {
        super(a, b, "/");
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return 0;
    }

    @Override
    int calc(int a, int b) {
        return a / b;
    }
}
