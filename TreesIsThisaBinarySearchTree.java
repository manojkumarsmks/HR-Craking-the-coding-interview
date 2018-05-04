// https://www.hackerrank.com/challenges/ctci-is-binary-search-tree/problem

public class TreesIsThisaBinarySearchTree{

	public static boolean IsBinaryTree(Node root, int max, int min) {
		
		if(root == null)
			return true;
		if(root.data <= min || root.data > max)
			return false;
		return IsBinaryTree(root.left, max, root.data) && IsBinaryTree(root.right, root.data, min);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
		}
	}

}
