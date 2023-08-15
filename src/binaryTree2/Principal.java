package binaryTree2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//criando a árvore

		Node b = new Node("B", null, null);
		Node raiz = new Node("A", b, null);
		Node raiz2 = new Node("A", null, null);
		BinaryTree arvoreTeste = new BinaryTree(raiz);
		BinaryTree arvoreTeste2 = new BinaryTree(raiz2);

		Node d = new Node("D", null, null);
		Node e = new Node("E", null, null);
		Node c = new Node("C", d, e);
		raiz.setRightNode(c);
		Node f = new Node("F", null, null);
		b.setLeftNode(f, b);
		
		System.out.println("Pai do C: " + arvoreTeste.parent(c).getValue());
		
		System.out.println("Profundidade do b: " + arvoreTeste.depth(b) ); 
		
		System.out.println("Numero de nós da árvore: " + arvoreTeste.size());

		System.out.println("Altura da árvore: " + arvoreTeste2.height());

		System.out.println(c.isExternal());
		System.out.println("É raiz: " + arvoreTeste.isRoot(c));
		System.out.println("Pré ordem:");
		arvoreTeste.printPreOrder();
		System.out.println("Em ordem:");
		arvoreTeste.printInOrder();
		System.out.println("Pós ordem:");
		arvoreTeste.printPosOrder();
		
	}

}
