package binaryTree2;

public class BinaryTree {
	Node root;
	
	public boolean isRoot(Node v) {
		if (v == root) return true;
		return false;
	}
	
    public Node parent(Node element){
        return (root==null|| root==element)?null:parent(root, element);
    }

    public Node parent(Node subTree,Node element){
        if(subTree==null)
            return null;
        if(subTree.getLeftNode()==element||subTree.getRightNode()==element)
            return subTree;
        Node p;
        
        if((p=parent(subTree.getLeftNode(), element))!=null)
           return p;
        else
            return parent(subTree.getRightNode(), element);
    }
	
    public int height() {
    	return height(root)-1;
    }
    private int height(Node subTree){
        if(subTree==null)
            return 0;
        else{
            int i=height(subTree.getLeftNode());
            int j=height(subTree.getRightNode());
            return (i<j)?(j+1):(i+1);
        }
    }
    
    
    public int size(){
    	return size(root);
    }
    private int size(Node subTree){
        if(subTree==null){
            return 0;
        }else{
            return 1+size(subTree.getLeftNode())
                    +size(subTree.getRightNode());
        }
    }
    
    
    public int depth(Node v) {
    	return depth(this, v);
    }
    
	public int depth(BinaryTree tree, Node atual) {
		
		if(tree.isRoot(atual)) {
		    return 0;
		  }
		  return 1 + depth(tree, tree.parent(atual));


	}
	
	public BinaryTree(Node root) {
		this.root = root;
	}

	void printPreOrder() {
		printPreOrder(root);
	}
	void printInOrder() {
		printInOrder(root);
	}
	void printPosOrder() {
		printPosOrder(root);
	}
	
	void printPreOrder(Node atual) {
		
		if (atual == null) 
			return;
		
		System.out.println(atual.getValue());
		printPreOrder(atual.getLeftNode());
		printPreOrder(atual.getRightNode());
		
	}
	
	void printInOrder(Node atual) {
		
		if (atual == null) 
			return;
		
		printInOrder(atual.getLeftNode());
		System.out.println(atual.getValue());
		printInOrder(atual.getRightNode());
		
	}
	
	void printPosOrder(Node atual) {
		
		if (atual == null) 
			return;
		
		printPosOrder(atual.getLeftNode());
		printPosOrder(atual.getRightNode());
		System.out.println(atual.getValue());
		
		
	}
	
}
