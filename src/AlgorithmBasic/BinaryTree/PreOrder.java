package AlgorithmBasic.BinaryTree;

public class PreOrder {
    public static void main(String[] args) {

    }
    public void preOrder(TreeNode root) {
        //base case
//        if (root == null) {
//            return;
//        }
        // leaf as base case
        if (root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            System.out.println(root.value);
            return;
        }

        // print, go left, go right
        System.out.println(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }
}
