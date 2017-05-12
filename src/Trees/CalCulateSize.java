package Trees;

public class CalCulateSize {
	public static int getSize(Tnode root) {
		if(root == null)return 0;
		return 1 + getSize(root.left) + getSize(root.right);
	}
	public static void main(String[] args) {
		Tnode root = new Tnode(1);
		root.left = new Tnode(2);
		root.right = new Tnode(3);
		root.left.left = new Tnode(4);
		root.left.right = new Tnode(5);
		root.printInorder(root);
		System.out.println(getSize(root));
	}
}
