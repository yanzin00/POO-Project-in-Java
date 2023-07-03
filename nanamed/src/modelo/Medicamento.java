package modelo;

/**
 * Classe onde se cria os medicamentos e herda da Classe produto
 * @author Yan Lucas, Felipe Matheus
 * @since 2023
 * @version 1.0
 * @see tipo 		tipo do medicamento
 * @see dosagem 	dosagem do medicamento
 */
public class Medicamento extends Produto {
	
	private String tipo;
	private String dosagem;

	/**
	 * Método que  chama o construtor da classe  Produto
	 */
	public Medicamento() {
		super();
	}
	/**
		 * Método que cria  os medicamentos
		 * @param nome 				nome do medicamento
		 * @param quantidade 		quantidade de medicamentos que tem na  filial
		 * @param preco				preço do medicamento
		 * @param validade 			validade do medicamento
		 * @param codigoDeBarra		codigo de barra do medicamento
		 * @param dosagem			dosagem do medicamento
		 * @param tipo				tipo de Medicamento
		 */
	public Medicamento(String nome, int quantidade, double preco, String validade, String codigoDeBarra, String dosagem, String tipo) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.validade = validade;
		this.codigoDeBarra = codigoDeBarra;
		this.dosagem = dosagem;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Medicamento: " +nome+ "| Qtd.: " +quantidade+ "| " +preco+ "$ | Validade:" +validade+ "| Codigo de barras: " +codigoDeBarra+
				"| Dosagem: " +dosagem+ "| Tipo:" +tipo;
				
	}
	//get e set do Tipo
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo= tipo;
	}
	//get e set da Dosagem
	public String getDosagem() {
		return dosagem;
	}	
	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}

}
