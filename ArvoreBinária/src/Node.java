
public class Node {
	private String valor;
    private Node nodeLeft, nodeRight;
	
    public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Node(String valor, Node nodeLeft, Node nodeRight) {//construtor
		super();
		this.valor = valor;
		this.nodeLeft = nodeLeft;
		this.nodeRight = nodeRight;
	}
	public Node getNodeLeft() {
		return nodeLeft;
	}
	public void setNodeLeft(Node nodeLeft) {
		this.nodeLeft = nodeLeft;
	}
	public Node getNodeRight() {
		return nodeRight;
	}
	public void setNodeRight(Node nodeRight) {
		this.nodeRight = nodeRight;
	}
	public String external() { //verifica se é folha
		if (nodeLeft == null && nodeRight == null) {
			return valor + " é folha!";
		}
		else {		
			return valor + " não é folha!";
		}
	}
	public int length() { //retorna o grau dos nos
		if (nodeLeft == null && nodeRight == null) //if de external, como se fosse if (external()), caso seja folha
			return 0;
		if (nodeLeft != null && nodeRight != null) 
			return 2;
		return 1;
	}
}





