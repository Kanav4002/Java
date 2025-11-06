package Lecture4;

import java.util.ArrayList;
import java.util.List;

class Node {
      int val;
      Node left;
      Node right;
      Node() {}
      Node(int val) { this.val = val; }
      Node(int val, Node left, Node right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class PathSum2 {
    public List<List<Integer>> pathSum(Node root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(root, targetSum, list, result);
        return result;
    }

    public void solve(Node root, int targetSum, List<Integer> list, List<List<Integer>> result) {
        if (root == null) return;
        list.add(root.val);

        if (root.left == null && root.right == null && root.val == targetSum) {
            result.add(new ArrayList<>(list));
            // we're creating another list because if we use the original list
            // at the end of the traversal it will become null so we send a new reference so it doesn't interfere
        }
        solve(root.left, targetSum - root.val, list, result);
        solve(root.right, targetSum - root.val, list, result);

        list.removeLast();
    }
}