package com.alessandron3;

import com.alessandron3.model.Node;
import org.junit.Assert;
import org.junit.Test;

import static com.alessandron3.MaxDepth.height;
import static com.alessandron3.MaxDepth.insert;

public class MaxDepthTest {


    /**
     * input: 3 5 2 1 4 6 7
     * output: 3
     */
    @Test
    public void test1() {
        int[] tree = {3, 5, 2, 1, 4, 6, 7};

        Node root = null;
        for(int i = 0; i < tree.length; i++) {
            root = insert(root, tree[i]);
        }

        int height = height(root);
        Assert.assertEquals(3, height);
    }

    /**
     * input: 3 1 7 5 4
     * output: 3
     */
    @Test
    public void test2() {
        int[] tree = {3, 1, 7, 5, 4};

        Node root = null;
        for(int i = 0; i < tree.length; i++) {
            root = insert(root, tree[i]);
        }

        int height = height(root);
        Assert.assertEquals(3, height);
    }

    /**
     * input: 15
     * output: 3
     */
    @Test
    public void test3() {
        int[] tree = {15};

        Node root = null;
        for(int i = 0; i < tree.length; i++) {
            root = insert(root, tree[i]);
        }

        int height = height(root);
        Assert.assertEquals(0, height);
    }
}
