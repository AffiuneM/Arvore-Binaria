
public class ArvoreBinaria {

    Node raiz;
    
    
    
    public Node getRaiz() {//retorna raiz
		return raiz;
	}
    
	public ArvoreBinaria (Node raiz){//construtor
        this.raiz = raiz;
    }
    
    public void ImprimeEmOrdem (Node node){
        if (node == null)
            return;

        ImprimeEmOrdem(node.getNodeLeft());//subarvore esquerda
        	System.out.print(node.getValor() + " ");//raiz no meio
        ImprimeEmOrdem(node.getNodeRight());//subarvore direita
    }
    
    public void ImprimePreOrdem (Node node){
        if (node == null)
            return;

        	System.out.print(node.getValor() + " ");//raiz no começo
        ImprimePreOrdem(node.getNodeLeft());//subarvore esquerda
        ImprimePreOrdem(node.getNodeRight());//subarvore direita
    }
   
    public void ImprimePosOrdem (Node node){
        if (node == null)
            return;

        ImprimePosOrdem(node.getNodeLeft());//subarvore esquerda
        ImprimePosOrdem(node.getNodeRight());//subarvore direita
        	System.out.print(node.getValor() + " ");//raiz no fim
    }
    
    public boolean EstritamenteBinaria(Node node) {
    	if (node == null)
    		return true;
    	if ((node.getNodeLeft() == null && node.getNodeRight() != null) || //caso tenha apenas um filho dos dois lados
    		(node.getNodeLeft() != null && node.getNodeLeft() == null))
    		return false;
    	
    	return EstritamenteBinaria(node.getNodeLeft()) && //atravez de recursividade, voltar nos filhos e fazer o metodo novamente, para percorrer toda a árvore
    		   EstritamenteBinaria(node.getNodeRight());
    }
    
    public int QuantidadeNos (Node node) {
	    if (node == null) {
	        return 0;
	    } else {
	        return (QuantidadeNos(node.getNodeRight()) + QuantidadeNos(node.getNodeLeft()) + 1);//recursividade para contar todos os nós
	    }
	}
    
    public int Profundidade (Node tree) {
	    if (tree == null) {
	        return 0;
	    } else 
	    	return Math.max(Profundidade(tree.getNodeLeft()), 
	    			Profundidade(tree.getNodeRight()))+1;
	    
	}
    
}
