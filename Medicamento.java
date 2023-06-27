package modelo;

public class Medicamento extends Produto {
	
	private String tarjaDeControle;
	private String dosagem;
	
	public Medicamento() {
		super();
	}
	public Medicamento(String nome, int quantidade, double preco, String validade, String codigoDeBarra, String dosagem, String tarjaDeControle) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.validade = validade;
		this.codigoDeBarra = codigoDeBarra;
		this.dosagem = dosagem;
		this.tarjaDeControle = tarjaDeControle;
	}
	public String toString() {
		return "nome d0 medicament0: " +nome+ ", quantidade: " +quantidade+ ", preco: R$" +preco+ ", validade: " +validade+ ", codigo de barra: " +codigoDeBarra+
				", dosagem: " +dosagem+ ", tarjaDeControle:" +tarjaDeControle;
				
	}
	
	public String getTarjaDeControle() {
		return tarjaDeControle;
	}
	public void setTarjaDeControle(String tarjaDeControle) {
		this.tarjaDeControle = tarjaDeControle;
	}
	
	public String getDosagem() {
		return dosagem;
	}	
	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}

}