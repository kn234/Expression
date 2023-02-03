package expression;

public class Variable extends Operation {
    String varName;

    public Variable(String varName) {
        this.varName = varName;
    }

    @Override
    public int evaluate(int x) {
        return x;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        if (varName.equals("x")) {
            return x;
        } else if (varName.equals("y")) {
            return y;
        } else {
            return z;
        }
    }
    @Override
    int calc(int a, int b) {
        return 0;
    }

    @Override
    public String toString() {
        return varName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (this.getClass() == obj.getClass()) {
                return this.varName.equals(((Variable) obj).varName);
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return varName.hashCode();
    }


}
