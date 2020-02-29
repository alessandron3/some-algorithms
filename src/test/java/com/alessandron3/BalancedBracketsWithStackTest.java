package com.alessandron3;

import org.junit.Assert;
import org.junit.Test;

import static com.alessandron3.BalancedBracketsWithStack.isBalanced;

public class BalancedBracketsWithStackTest {

    @Test
    public void test1() {
        String s = "{(([])[])[]}";

        boolean balanced = isBalanced(s);

        Assert.assertTrue(balanced);
    }

    @Test
    public void test2() {
        String s = "{{[[(())]]}}";

        boolean balanced = isBalanced(s);

        Assert.assertTrue(balanced);
    }


    @Test
    public void test3() {
        String s = "}][}}(}][))]";

        boolean balanced = isBalanced(s);

        Assert.assertFalse(balanced);
    }
    @Test
    public void test4() {
        String s = "{}[[{[((}[(}[[]{{]([(}]][[";

        boolean balanced = isBalanced(s);

        Assert.assertFalse(balanced);
    }


}
