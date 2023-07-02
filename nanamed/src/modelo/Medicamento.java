package modelo;

public class Medicamento extends Produto {
	
	private String tipo;
	private String dosagem;
	
	public Medicamento() {
		super();
	}
	public Medicamento(String nome, int quantidade, double preco, String validade, String codigoDeBarra, String dosagem, String tipo) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.validade = validade;
		this.codigoDeBarra = codigoDeBarra;
		this.dosagem = dosagem;
		this.tipo = tipo;
	}
	public String toString() {
		return "Medicamento: " +nome+ "| Qtd.: " +quantidade+ "| " +preco+ "$ | Validade:" +validade+ "| Codigo de barras: " +codigoDeBarra+
				"| Dosagem: " +dosagem+ "| Tipo:" +tipo;
				
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo= tipo;
	}
	
	public String getDosagem() {
		return dosagem;
	}	
	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}

}
