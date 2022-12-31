package BinarySearchTree;

class Node {
	char key;
	Node left, right;
	Node(char key) {
		this.key = key;
	}
}

class BinarySolution {
	Node root;
	void insertKey(char key) {
		root = insertInTree(root, key);
	}
	Node insertInTree(Node root, char key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		if(key < root.key) {
			root.left = insertInTree(root.left, key);
		}
		else if(key > root.key) {
			root.right = insertInTree(root.right, key);
		}
		return root;
	}
	void preOrderTraversal(Node root) {
		if(root != null) {
			System.out.print(root.key + " ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
}



public class BST {
	 public static void main(String[] args) {
		 BinarySolution b1 = new BinarySolution();
		 b1.insertKey('D');
		 b1.insertKey('B');
		 b1.insertKey('F');
		 b1.insertKey('A');
		 b1.insertKey('G');
		 b1.insertKey('H');
		 
		 b1.preOrderTraversal(b1.root);
	 }
}
