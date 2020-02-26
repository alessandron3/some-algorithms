package com.alessandron3;


import com.alessandron3.model.Node;

import java.util.Scanner;

public class MaxDepth {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }


    /**
     * Max Depth algorithm
     *
     * @param root
     * @return height of a binary tree
     */
    public static int height(Node root) {
        if(root == null)
            return 0;

        // if root's tree does not have leaf it height is 0
        if(root.left == null && root.right == null)
            return 0;
        else {
            int leftDepth = height(root.left);
            int rightDepth = height(root.right);

            if(leftDepth > rightDepth)
                return leftDepth + 1;
            else
                return rightDepth + 1;
        }
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

}

