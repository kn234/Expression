package expression;

public class Multiply extends Operation implements Expression, TripleExpression {

    public Multiply(Operation a, Operation b) {
        super(a, b, "*");
    }

    @Override
    int calc(int a, int b) {
        return a * b;
    }
}
