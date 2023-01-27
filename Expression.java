package expression;

public interface Expression {
    String toString();

    int evaluate(int a);

    boolean equals(Expression a);
}
