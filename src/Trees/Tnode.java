package Trees;

public class Tnode {
	int data;
	Tnode left, right;
	Tnode(int data){
		this.data = data;
	}
	public void printInorderUtil(Tnode root) {
		if(root != null) {
			printInorderUtil(root.left);
			System.out.print(root.data + "  ");
			printInorderUtil(root.right);
		}
	}
	public void printInorder(Tnode root) {
		printInorderUtil(root);
		System.out.println();
	}
}
