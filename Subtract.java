package expression;

public class Subtract extends Operation {
    public Subtract(Expressions a, Expressions b) {
        super(a, b, "-");
    }

    @Override
    int calc(int a, int b) {
        return a - b;
    }
}
