package expression;

public interface Expression {
    @Override
    String toString();
    int evaluate(int a);
    boolean equals(Expression a);
}
