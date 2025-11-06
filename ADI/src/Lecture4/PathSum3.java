package Lecture4;

class TreeNode {
    int val;
    treeNode left;
    treeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, treeNode left, treeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
}

class PathSum3 {
    public int pathSum(treeNode root, int targetSum) {
        if (root == null) return 0;
        return solve(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }
    /*
       long because of this test case
       [1000000000,1000000000,null,294967296,null,1000000000,null,1000000000,null,1000000000]
     */

    public int solve(treeNode root, long targetSum) {
        if (root == null) return 0;
        int count = 0;
        if (root.val == targetSum) count++;
        count = count + solve(root.left, targetSum - root.val);
        count = count + solve(root.right, targetSum - root.val);
        return count;
    }
}
