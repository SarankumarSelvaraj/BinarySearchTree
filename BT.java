package TreeHierarchy;
 
class Node {
	char key;
	Node left, right;
	Node(char key) {
		this.key = key;
	}
}
class TreeTraversal {
	Node root;
	void preOrderTraversal(Node n) {
		if(n != null) {
			System.out.print(n.key + " ");
			preOrderTraversal(n.left);
			preOrderTraversal(n.right);
		}
	}
	void inorderTraversal(Node n) {
		if(n != null) {
			inorderTraversal(n.left);
			System.out.print(n.key + " ");
			inorderTraversal(n.right);
		}
	}
	void postOrderTraversal(Node n) {
		if(n != null) {
			postOrderTraversal(n.left);
			postOrderTraversal(n.right);
			System.out.print(n.key + " ");
		}
	}
}


public class BT {
  public static void main(String[] args) {
	  TreeTraversal t1 = new TreeTraversal();
	  t1.root = new Node('A');
	  t1.root.left = new Node('B');
	  t1.root.right = new Node('C');
	  t1.root.left.left = new Node('D');
	  t1.root.left.right = new Node('E');
	  t1.root.right.left = new Node('F');
	  t1.root.right.right = new Node('G');
	  t1.preOrderTraversal(t1.root);
	  System.out.println();
	  t1.inorderTraversal(t1.root);
	  System.out.println();
	  t1.postOrderTraversal(t1.root);
  }
}
