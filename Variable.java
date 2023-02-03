package expression;

public class Variable implements Expression, TripleExpression {
    String varName;

    public Variable(String varName) {

        this.varName = varName;
    }

    @Override
    public int evaluate(int a) {
        return a;
    }

    @Override
    public String toString() {
        return varName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            return this.getClass() == obj.getClass();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return varName.hashCode();
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return 0;
    }
}
