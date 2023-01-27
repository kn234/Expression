package expression;

public class Variable implements Expression {
    String field;

    public Variable(String field) {
        this.field = field;
    }


    public int evaluate(int a) {
        return a;
    }

    public String toString() {
        return field;
    }

    public boolean equals(Expression a) {
        return this.toString().equals(a.toString());
    }


}
