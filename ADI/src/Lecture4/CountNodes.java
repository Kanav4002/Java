package Lecture4;

class treeNode {
      int val;
      treeNode left;
      treeNode right;
      treeNode() {}
      treeNode(int val) { this.val = val; }
      treeNode(int val, treeNode left, treeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

class CountNode {
    private treeNode root;

    public int countNodes() {
        return countNodes(this.root);
    }

    public int countNodes(treeNode root) {
        if (root == null) return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public static void main(String[] args) {
        CountNode tt = new CountNode();
        int data = tt.countNodes();
        System.out.println(data);
    }
}