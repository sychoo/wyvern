package wyvern.tools.tests.reflection;

import org.junit.Assert;

/**
 * Created by ewang on 3/17/16.
 */
public class TestTools {

    public int assertIntEquals(int x, int y) {
        Assert.assertEquals(x, y);
        return 0;
    }

    public int assertStringEquals(String x, String y) {
        Assert.assertEquals(x, y);
        return 0;
    }

    public int add(int x, int y) {
        return x + y;
    }

    public boolean intEquals(int x, int y) {
        return x == y;
    }

    public Object ifTrue(boolean cond,  Object branch1, Object branch2) {
        return cond ? branch1 : branch2;
    }
}
