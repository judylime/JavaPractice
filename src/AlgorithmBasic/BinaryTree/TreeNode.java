package AlgorithmBasic.BinaryTree;

import AlgorithmBasic.LinkedList.ListNode;

public class TreeNode {
    public int value; // the storage value
    public TreeNode root; // it is reference, or, it is an address; 黄色小纸条，抽屉编号
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { // Constructor
        this.value = x;
    }

}
