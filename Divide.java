package expression;

import expression.common.Op;

public class Divide extends Operation implements Expression, TripleExpression {


    public Divide(Operation a, Operation b) {
        super(a, b, "/");
    }


    @Override
    int calc(int a, int b) {
        return a / b;
    }
}
