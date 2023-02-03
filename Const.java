package expression;

public class Const extends Operation {
    int value;

    public Const(int value) {
        this.value = value;
    }

    @Override
    public int evaluate(int x) {
        return value;
    }

    @Override
    int calc(int a, int b) {
        return 0;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (this.getClass() == obj.getClass()) {
                return this.value == ((Const) obj).value;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return value;
    }
}
