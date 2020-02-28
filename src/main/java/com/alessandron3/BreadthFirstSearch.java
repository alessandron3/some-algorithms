package com.alessandron3;

import com.alessandron3.model.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.data+" ");

            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
        }
    }


    public static int bfs(Node root, int number) {

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            if(node.data == number)
                return node.data;

            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
        }

        return -1;
    }

}
