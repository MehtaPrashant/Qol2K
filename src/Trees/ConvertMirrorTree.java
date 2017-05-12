package Trees;

public class ConvertMirrorTree {
	public static void mirrorImage(Tnode root) {
		if(root == null)return;
		Tnode temp = root.left;
		root.left = root.right;
		root.right = temp;
		mirrorImage(root.left);
		mirrorImage(root.right);
	}
	public static void main(String[] args) {
		Tnode root = new Tnode(1);
		root.left = new Tnode(3);
		root.right = new Tnode(2);
		root.right.left = new Tnode(5);
		root.right.right = new Tnode(4);
		new Tnode(0).printInorder(root);
		mirrorImage(root);
		new Tnode(0).printInorder(root);
		
	}
}
