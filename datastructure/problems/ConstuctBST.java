package com.dsa.questions.Questions.Tree;
//https://leetcode.com/problems/convert-bst-to-greater-tree/submissions/
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class ConstuctBST {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);

		TreeNode n1 = new TreeNode(2);
		TreeNode n2 = new TreeNode(4);
		TreeNode n3 = new TreeNode(1);

		root.left = n1;
		root.right = n2;
		
		n1.left = n3;
		
		TreeNode out = convertBST(root);
		System.out.println(out.val);
	}

	public static TreeNode convertBST(TreeNode root) {
		helper(root, 0);
		return root;
	}

	public static int helper(TreeNode node, int sum) {
		if (node == null) {
			return sum;
		}
		if (node != null && node.left == null && node.right == null) {
			sum = node.val + sum;
			node.val = sum;
			return sum;
		}
		if (node.right != null) {
			sum = helper(node.right, sum);
			// sum = sum + s + node.val;
			sum = sum + node.val;
			node.val = sum;
		}
		if (node.right == null) {
			node.val = sum + node.val;
		}
		if (node.left != null) {
			sum = helper(node.left, sum);
		}
		return sum;
	}

}
