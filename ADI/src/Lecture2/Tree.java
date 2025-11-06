package Lecture2;

import java.util.*;

class Tree {
    Scanner sc = new Scanner(System.in);
    private Node root;

    public class Node {
        int data;
        Node left;
        Node right;

        public Node() {}

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public void createTree() {
        this.root = createTree(root);
    }

    private Node createTree(Node root) {
        int value = sc.nextInt();
        Node node = new Node();
        node.data = value;

        boolean hlc = sc.nextBoolean();
        if (hlc) {
            node.left = createTree(node);
        }

        boolean hrc = sc.nextBoolean();
        if (hrc) {
            node.right = createTree(node);
        }

        return node;
    }

    public void preorder() {
        preorder(this.root);
    }

    private void preorder(Node root) {
        if (root == null) return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder() {
        inorder(this.root);
    }

    private void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public void postorder() {
        postorder(this.root);
    }

    private void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }


    public void display(Node node) {
        if (node == null) return;
        System.out.println(node.data);
        display(node.left);
        display(node.right);
    }

    public int max() {
        return max(this.root);
    }

    private int max(Node root) {
        if (root == null) return 0;
        int value = root.data;
        int left = max(root.left);
        int right = max(root.right);
        return Math.max(value, Math.max(left, right));
    }

    public int maxDepth() {
        return maxDepth(this.root);
    }

    private int maxDepth(Node root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1; // 1 for the root node itself
    }

    public static void main (String[] args) {
        Tree tt = new Tree();
        tt.createTree();
        tt.display(tt.root);

//        System.out.println("Preorder");
//        tt.preorder();

        System.out.println("Inorder");
        tt.inorder();

//        System.out.println("Postorder");
//        tt.postorder();

//        System.out.print("Max Element : ");
//        int val = tt.max();
//        System.out.println(val);

        System.out.print("Max Depth : ");
        int depth = tt.maxDepth();
        System.out.println(depth);
    }
}