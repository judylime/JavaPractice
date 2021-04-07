package AlgorithmBasic.BinaryTree;

public class PostOrder {
    public void postOrder(TreeNode root) {
        if (root == null) {
            return; // base case
        }
        // go left, go right, print

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.value);
    }
}
