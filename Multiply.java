package expression;

public class Multiply extends Operation implements Expression, TripleExpression {

    public Multiply(Expression a, Expression b) {
        super(a, b,"*");
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return 0;
    }
}
