package expression;

import expression.common.Op;

public class Divide extends Operation {


    public Divide(Expressions a, Expressions b) {
        super(a, b, "/");
    }


    @Override
    int calc(int a, int b) {
        return a / b;
    }
}
