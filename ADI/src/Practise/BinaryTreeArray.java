package Practise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeArray {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node() {
            data = 0;
        }

        public Node(int d) {
            data = d;
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    private static Node buildTree(int[] arr, int n) {
        if (n == 0) return null;
        Node root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while (!q.isEmpty()) {
            Node node = q.poll();

            if (i < n) {
                node.left = new Node(arr[i]);
                q.add(node.left);
                i++;
            }

            if (i < n) {
                node.right = new Node(arr[i]);
                q.add(node.right);
                i++;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(sc.nextLine().trim());

        Node root = null;
        root = buildTree(arr, n);
        inOrder(root);
    }
}
