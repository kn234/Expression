package expression;

public class Variable implements Expression {
    String field;

    public Variable(String field) {
        this.field = field;
    }

    @Override
    public int evaluate(int a) {
        return a;
    }
    @Override
    public String toString(){
        return field;
    }
    public boolean equals(Expression a){
        return this.toString().equals(a.toString());
    }


}
