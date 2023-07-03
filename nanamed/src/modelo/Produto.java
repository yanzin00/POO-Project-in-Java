package modelo;

/**
 * Classe que cria os Produtos
 * @author Yan Lucas, Felipe Matheus
 * @since 2023
 * @version 1.0
 * @see nome 		nome do produto
 * @see quantidade 		quantidade de produtos
 * @see preco 		preço dos produtos
 * @see validade 		validade do produto
 * @see codigoDeBarra 		codigo de barra dos produtos
 */

public abstract class Produto {
	protected String nome;
	protected int quantidade;
	protected double preco;
	protected String validade;
	protected String codigoDeBarra;
	
	
	
	// get e set do Nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
	//get e set da Quantidade
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	//get e set do Preco
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	//get e set da Validade
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	//get e set do codigoDeBarra
	public String getCodigoDeBarra() {
		return codigoDeBarra;
	}
	public void setCodigoDeBarra(String codigoDeBarra) {
		this.codigoDeBarra = codigoDeBarra;
	}

}
