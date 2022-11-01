
public class Main {

	public static void main(String[] args) {
		
		//setar elementos
		
		Node B = new Node("B", null, null);
		Node D = new Node("D", null, null);
		Node E = new Node("E", null, null);
		Node C = new Node("C", null, null);
		Node F = new Node("F", null, null);
		Node G = new Node("G", null, null);
		Node Raiz = new Node("A", B, C);
		
		//setar os nós, esquerda/direita
		
			B.setNodeLeft(D);
			B.setNodeRight(E);
			C.setNodeLeft(F);
			C.setNodeRight(G);
				
		//setar a arvore e percorrer
			
		ArvoreBinaria arvoreBinariaTeste = new ArvoreBinaria(Raiz);
		
		arvoreBinariaTeste.getRaiz();
		
			System.out.print("Em Ordem: ");
		arvoreBinariaTeste.ImprimeEmOrdem(Raiz);
			System.out.print("\nPré Ordem: ");
		arvoreBinariaTeste.ImprimePreOrdem(Raiz);
			System.out.print("\nPós Ordem: ");
		arvoreBinariaTeste.ImprimePosOrdem(Raiz);
		
		//verificar se é estritamente binária
		
			System.out.println("\nÉ estritamente binária: ");
		System.out.println(arvoreBinariaTeste.EstritamenteBinaria(Raiz));
		
		//analizar se são folhas e quantos graus cada nó possui	
		
		System.out.println(Raiz.external());
			System.out.println("Grau: " + Raiz.length());
		System.out.println(B.external());
			System.out.println("Grau: " + B.length());
		System.out.println(C.external());
			System.out.println("Grau: " + C.length());
		System.out.println(D.external());
			System.out.println("Grau: " + D.length());
		System.out.println(E.external());
			System.out.println("Grau: " + E.length());
		System.out.println(F.external());
			System.out.println("Grau: " + F.length());
		System.out.println(G.external());
			System.out.println("Grau: " + G.length());
		
		
	}

}
