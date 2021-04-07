package AlgorithmBasic.BinaryTree;

public class CheckBalanced {
    public static boolean checkBalanced(TreeNode root) {
        // base case
        if (root == null) {
            return true;
        }

        // left call right call
        boolean left = checkBalanced(root.left);
        boolean right = checkBalanced(root.right);

        //judge if the height diff of current node is satisfied
        int leftH = getHeight(root.left);
        int rightH = getHeight(root.right);
        // logic
        if (!left || !right) {
            return false;
        }

        if (Math.abs(leftH - rightH) > 1) {
            return false;
        }
        return true;
    }
    private static int getHeight(TreeNode root) {
        // base case
        if (root == null) {
            return 0;
        }
        // sub
        int leftH = getHeight(root.left);
        int rightH = getHeight(root.right);
        // recursive rule
        int cur = Math.max(leftH, rightH) + 1;
        return cur;
    }

    public static int getHeightOrUnbalance(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftH = getHeightOrUnbalance(root.left);
        int rightH = getHeightOrUnbalance(root.right);

        //left subtree or right subtree is unBalance
        if (leftH == -1 || rightH == -1) {
            return -1;
        }
        // diff of left subtree or right subtree > 1
        if (Math.abs(leftH - rightH) > 1) {
            return -1;
        }
        // return my height to top level
        return Math.max(leftH, rightH) + 1;
    }

    public static boolean ifBalance(TreeNode root) {
        return getHeightOrUnbalance(root) >= 0;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(8);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(10);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(6);
        node1.right = node2;
        node2.left = node3;
        node2.right = node4;
        node3.right = node5;
        node4.right = node6;

        boolean result = ifBalance(node1);
        System.out.print(result);
    }
}
