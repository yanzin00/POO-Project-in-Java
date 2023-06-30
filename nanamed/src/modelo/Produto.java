package modelo;

public abstract class Produto {
	protected String nome;
	protected int quantidade;
	protected double preco;
	protected String validade;
	protected String codigoDeBarra;
	
	
	public Produto() {
		super();
	}
	
	// gets e sets

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public String getCodigoDeBarra() {
		return codigoDeBarra;
	}
	public void setCodigoDeBarra(String codigoDeBarra) {
		this.codigoDeBarra = codigoDeBarra;
	}

}
