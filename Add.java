package expression;

public class Add extends Operation implements Expression, TripleExpression {

    public Add(Operation a, Operation b) {
        super(a, b, "+");
    }

    @Override
    int calc(int a, int b) {
        return a + b;
    }
}