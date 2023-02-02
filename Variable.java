package expression;

import java.util.*;

public class Variable implements Expression, TripleExpression {
    String vrName;

    Map<String, Integer> vr = new HashMap<>();

    public Variable(String vrName) {
        if (!vr.containsKey(vrName)) {
            vr.put(vrName, 0);

        }
        this.vrName = vrName;
    }
//    public Variable(String field) {
//        this.field = field;
//    }

    @Override
    public int evaluate(int a) {
        vr.put(vrName, a);
        return vr.get(vrName);
    }

    @Override
    public String toString() {
        return vrName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            return this.getClass() == obj.getClass();
        }
        return false;
        }

    @Override
    public int hashCode() {
        return vrName.hashCode();
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return 0;
    }
}
