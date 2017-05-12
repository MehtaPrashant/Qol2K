package Trees;
public class CheckTwoTreesIdentical {
	public static boolean CheckIfIdentical(Tnode root1, Tnode root2) {
		if(root1 == null && root2 == null)return true;
		if(root1 == null || root2 == null)return false;
		return root1.data == root2.data
				&& CheckIfIdentical(root1.left, root2.left)
				&& CheckIfIdentical(root1.right, root2.right);
	}
	public static void main(String[] args) {
		Tnode root1 = new Tnode(1);
		root1.left = new Tnode(2);
		root1.right = new Tnode(3);
		root1.left.left = new Tnode(4);
		root1.left.right = new Tnode(5);
		root1.printInorder(root1);
		Tnode root2 = new Tnode(1);
		root2.left = new Tnode(2);
		root2.right = new Tnode(3);
		root2.left.left = new Tnode(4);
		root2.left.right = new Tnode(5);
		root2.printInorder(root2);
		System.out.println("The 2 trees are identical: " + CheckIfIdentical(root1, root2));
	}
}
