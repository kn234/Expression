package expression;

public class Multiply extends Operation {

    public Multiply(Expressions a, Expressions b) {
        super(a, b, "*");
    }

    @Override
    int calc(int a, int b) {
        return a * b;
    }
}
