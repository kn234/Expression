package expression;

public class Const implements Expression {
    int field;

    public Const(int field) {
        this.field = field;
    }

    public int evaluate(int a){
        return field;
    }

    @Override
    public String toString() {
        return Integer.toString(field);
    }
    public boolean equals(Expression a){
        return this.toString().equals(a.toString());
    }


}
