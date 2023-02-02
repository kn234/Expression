package expression;

public class Const implements Expression, TripleExpression {
    int field;

    public Const(int field) {
        this.field = field;
    }

    @Override
    public int evaluate(int a) {
        return field;
    }

    @Override
    public String toString() {
        return Integer.toString(field);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null) {
            if (this.getClass() == obj.getClass()) {
                return this.field == ((Const) obj).field;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return field;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return 0;
    }
}
