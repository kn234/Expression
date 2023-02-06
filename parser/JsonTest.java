package expression.parser;;

import expression.*;
import junit.framework.Assert;
import org.junit.Test;

import java.util.Map;


public class JsonTest {
    @Test
    public void test() {
        Assert.assertEquals(true, Json.parse("true"));

    }
    @Test
    public void testSpace(){
        Assert.assertEquals(true, Json.parse("  true    "));
        Assert.assertEquals(true, Json.parse("  true"));
        Assert.assertEquals(true, Json.parse("true    "));
    }
    @Test
    public void testStringParse(){
        Assert.assertEquals("true", Json.parse(" \"true\"  "));
        Assert.assertEquals("    true    ", Json.parse("  \"    true    \""));
        Assert.assertEquals("true  ", Json.parse("\"true  \"  "));
    }
    @Test
    public void testExpressionParse(){
        Assert.assertEquals(new Add(new Variable("x"), new Const(2)), Json.parse("(x + 2)"));
        Assert.assertEquals(new Add(new Divide(new Const(555), new Variable("x")), new Variable("x")), Json.parse("( (   555    / x ) + x)   "));
        Assert.assertEquals(new Add(new Const(99), new Multiply(new Variable("x"), new Const(4))), Json.parse("(99 + (x * 4))"));


    }

}
