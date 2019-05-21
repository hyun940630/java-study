public class Main {
	public static void main(String[] args) {
		TreeNode bt1 = new TreeNode(1);	// Root Node
		TreeNode bt2 = new TreeNode(2);
		TreeNode bt3 = new TreeNode(3);
		TreeNode bt4 = new TreeNode("Song");
		
		bt1.makeLeftSubTree(bt2);
		bt1.makeRightSubTree(bt3);
		bt2.makeLeftSubTree(bt4);
		
		// Data output of the left child node of bt1
		System.out.println(bt1.getLeftSubTree().getData());
		// Data output of the right child node of bt1
		System.out.println(bt1.getRightSubTree().getData());
		// Data output of the left child node of bt2
		System.out.println(bt2.getLeftSubTree().getData());
	}
}
