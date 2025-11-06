package Lecture5;

class ValidateBST {
    class Pair {
        long min;
        long max;
        boolean isBST;

        Pair() {
            min = Long.MAX_VALUE;
            max = Long.MIN_VALUE;
            isBST = true;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return solve(root).isBST;
    }

    public Pair solve(TreeNode root) {
        if (root == null) return new Pair();

        Pair leftPair = solve(root.left);
        Pair rightPair = solve(root.right);
        Pair selfPair = new Pair();

        if (leftPair.isBST && rightPair.isBST &&
                root.val > leftPair.max && root.val < rightPair.min) {

            selfPair.isBST = true;
            selfPair.min = Math.min(root.val, Math.min(leftPair.min, rightPair.min));
            selfPair.max = Math.max(root.val, Math.max(leftPair.max, rightPair.max));
        } else {
            selfPair.isBST = false;
        }

        return selfPair;
    }
}
