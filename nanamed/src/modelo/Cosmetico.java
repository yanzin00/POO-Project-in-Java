package modelo;

public class Cosmetico extends Produto {
	
	
	private String volume;
	private String marca;

	public Cosmetico() {
		super();
	}
	
	public Cosmetico(String nome, int quantidade, double preco, String validade, String codigoDeBarra, String volume, String marca) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.validade = validade;
		this.codigoDeBarra = codigoDeBarra;
		this.volume = volume;
		this.marca = marca;
	}
	public String toString() {
		return "Cosmetico: " +nome+ "| Qtd.: " +quantidade+ "| " +preco+ "$ | Validade:" +validade+ "| Codigo de barras: " +codigoDeBarra+
				"| Volume: " +volume+ "| Marca:" +marca;
				
	}

	//gets e sets

	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	

}
