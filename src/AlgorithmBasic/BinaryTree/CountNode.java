package AlgorithmBasic.BinaryTree;

public class CountNode {
    public int countNode(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = countNode(root.left);
        int right = countNode(root.right);
        return 1 + left + right;
    }
}
