package binaryTree2;

public class Node {
	private String value;
	private Node leftNode, rightNode;
	
	

	public Node(String value, Node leftNode, Node rightNode) {
		this.value = value;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}
	


	public boolean isExternal() {
		if (this.leftNode == null && this.rightNode == null)
			return true;
		else 
			return false;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Node getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(Node leftNode, Node chamador) {
		this.leftNode = leftNode;
	}
	public Node getRightNode() {
		return rightNode;
	}
	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}
	
	
}
