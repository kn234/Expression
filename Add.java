package expression;

import java.util.Map;

public class Add extends Operation implements Expression, TripleExpression {

    public Add(Expression a, Expression b) {
        super(a, b,"+");
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return 0;
    }


}