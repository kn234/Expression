package expression;

public class Subtract extends Operation {
    public Subtract(Operation a, Operation b) {
        super(a, b, "-");
    }

    @Override
    int calc(int a, int b) {
        return a - b;
    }
}
