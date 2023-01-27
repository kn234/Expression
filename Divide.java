package expression;

import java.util.ArrayList;
import java.util.List;

public class Divide implements Expression {
    List<Expression> element = new ArrayList<>();


    public Divide(Expression a, Expression b) {
        if (a != null && b != null) {
            element.add(a);
            element.add(b);
        }
    }

    @Override
    public int evaluate(int a) {
        return element.get(0).evaluate(a) / element.get(1).evaluate(a);
    }

    @Override
    public String toString() {
        return "(" + element.get(0).toString() + "/" + element.get(1).toString() + ")";
    }
    public boolean equals(Expression a){
        return this.toString().equals(a.toString());
    }
}
