package expression;

import java.util.ArrayList;
import java.util.List;

public class Add implements Expression {
    List<Expression> element = new ArrayList<>();


    public Add(Expression a, Expression b) {
        if (a != null && b != null) {
            element.add(a);
            element.add(b);
        }
    }


    public int evaluate(int a) {
        return element.get(0).evaluate(a) + element.get(1).evaluate(a);
    }

    public String toString() {
        return "(" + element.get(0).toString() + "+" + element.get(1).toString() + ")";
    }

    public boolean equals(Expression a) {
        return this.toString().equals(a.toString());
    }


}
