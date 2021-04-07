package AlgorithmBasic.BinaryTree;

public class InOrder {


    public void inOrder(TreeNode root) {
        //base case
        if(root == null) {
            return;
        }

        // go left, print, go right
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }
}
