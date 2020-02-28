package com.alessandron3;

import com.alessandron3.model.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.alessandron3.BreadthFirstSearch.bfs;
import static com.alessandron3.MaxDepth.insert;

public class BreadthFirstSearchTest {

    Node root = null;

    @Before
    public void setup() {
        int[] tree = {3, 5, 2, 1, 4, 6, 7};

        Node root = null;
        for(int i = 0; i < tree.length; i++) {
            root = insert(root, tree[i]);
        }
    }


    /**
     * input: 3 5 2 1 4 6 7
     *
     */
    @Test
    public void testSuccess() {
        int result = bfs(root, 4);
        Assert.assertEquals(4, result);

    }

    @Test
    public void testFail() {
        int result = bfs(root, 10);
        Assert.assertEquals(-1, result);

    }
}
