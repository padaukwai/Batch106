package pac.practice;

public class BinaryTreeEg {
Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeEg btreeg=new BinaryTreeEg();
		btreeg.root=new Node(1);
		btreeg.root.left=new Node(2);
		btreeg.root.right=new Node(3);
		btreeg.root.left.left=new Node(4);
		btreeg.root.left.right=new Node(5);
		printPreOrder(btreeg.root);
		//1
	   //2 3
      //4 5
	}
	public static void printPreOrder(Node node) {
		if(node==null)
			return;
		System.out.println(node.data);
		printPreOrder(node.left);
		printPreOrder(node.right);
	}

}
