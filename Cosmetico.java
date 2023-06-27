package modelo;

public class Cosmetico extends Produto {
	
	
	private String volume;
	private String marca;

	public Cosmetico() {
		super();
	}
	
	public Cosmetico(String nome, int quantidade, double preco,
	String validade, String codigoDeBarra, String volume, String marca) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.validade = validade;
		this.codigoDeBarra = codigoDeBarra;
		this.volume = volume;
		this.marca = marca;
	}
	public String toString() {
		return "nome d0 cosmetic0: " +nome+ ", quantidade: " +quantidade+ ", preco: R$" +preco+ ", validade: " +validade+ ", codigo de barra: " +codigoDeBarra+
				", volume: " +volume+ ", Marca:" +marca;
				
	}
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