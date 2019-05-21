public class TreeNode {
	private TreeNode left;
	private TreeNode right;
	private Object data;
	
	public TreeNode(Object item) {
		left = null;
		right = null;
		data = item;
	}
	
	// connect with current node and left child node
	public void makeLeftSubTree(TreeNode sub) {
		if (this.left != null) this.left = null;
		this.left = sub;
	}
	
	// connect with current node and right child node
	public void makeRightSubTree(TreeNode sub) {
		if(this.right != null) this.right = null;
		this.right = sub;
	}
	
	// Return current data
	public Object getData() {
		return this.data;
	}
	
	// Return left child node
	public TreeNode getLeftSubTree() {
		return this.left;
	}
	
	// Return right child node
	public TreeNode getRightSubTree() {
		return this.right;
	}
}
