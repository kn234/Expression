package expression;

public class Add extends Operation {

    public Add(Expressions a, Expressions b) {
        super(a, b, "+");
    }

    @Override
    int calc(int a, int b) {
        return a + b;
    }
}