package Lecture4;

import java.util.*;

class IsSymmetric {
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

    public int diameter() {
        return diameter(this.root);
    }

    private int dia = 0;
    private int diameter(Node root) {
        calculateHeight(root);
        return dia;
    }

    private int calculateHeight(Node root) {
        if (root == null) return 0;
        int left = calculateHeight(root.left);
        int right = calculateHeight(root.right);
        dia = Math.max(dia, left + right);
        return Math.max(left, right) + 1;
    }

    public boolean hasPathSum() {
        int targetSum = sc.nextInt();
        return hasPathSum(this.root, targetSum);
    }

    private boolean hasPathSum(Node root, int targetSum) {
        if (root == null) return false;

        if (root.left == null && root.right == null) {
            if (root.data == targetSum) {
                return true;
            }
        }

        return hasPathSum(root.left, targetSum - root.data)
                || hasPathSum(root.right, targetSum - root.data);
    }

    public int countLeaves() {
        return countLeaves(this.root);
    }

    private int countLeaves(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1; // means they are just leaves
        return countLeaves(root.left) + countLeaves(root.right);
    }

    public boolean isSymmetric() {
        return isSymmetric(this.root);
    }

    private boolean isSymmetric(Node root) {
        if (root == null) return true;
        return checkSymmetric(root.left, root.right);
    }

    private boolean checkSymmetric(Node root1, Node root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.data != root2.data) return false;

        return checkSymmetric(root1.left, root2.right) && checkSymmetric(root1.right, root2.left);
    }

    public static void main (String[] args) {
        IsSymmetric tt = new IsSymmetric();
        tt.createTree();
        tt.display(tt.root);
//
//        System.out.println("Preorder");
//        tt.preorder();
//
//        System.out.println("Inorder");
//        tt.inorder();
//
//        System.out.println("Postorder");
//        tt.postorder();

//        System.out.print("Max Element : ");
//        int val = tt.max();
//        System.out.println(val);
//
//        System.out.print("Max Depth : ");
//        int depth = tt.maxDepth();
//        System.out.println(depth);

//        System.out.print("Diameter of Tree : ");
//        int diam = tt.diameter();
//        System.out.println(diam);

//        boolean val = tt.hasPathSum();
//        System.out.println(val);

//        int leafCount = tt.countLeaves();
//        System.out.println("Total Leaves are : " + leafCount);
        /*
            Input : 1 true 10 true 5 false false false true 39 false false
            Output : 2

            Input : 4 true 8 true 7 true 3 false false false false true 10 true 5 false false true 1 false false
            Output : 3
         */
        if (tt.isSymmetric()) {
            System.out.println("Tree is symmetric");
        } else {
            System.out.println("Tree is not symmetric");
        }

    }
}