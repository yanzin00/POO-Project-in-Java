package modelo;

import java.util.*;
/**
 * Classse que cria as filiais
 * @author Yan Lucas, Felipe Matheus
 * @since 2023
 * @version 1.0	
 * @see nome 		nome da filial
 * @see cidade 		cidade onde fica a filial
 * @see telefone 		nomero do telefone da filial
 * 
 */

public class Filial {

	private String nome;
	private String cidade;
	private String telefone;
	private ArrayList<Medicamento> medicamento = new ArrayList<Medicamento>();
	private ArrayList<Cosmetico> cosmetico = new ArrayList<Cosmetico>();

	/**
	 * Método que se cria as filiais 
	 * @param nome 		nome das filiais
	 * @param cidade 		cidade da filial
	 * @param telefone		telefone da filial
	 */
	
	public Filial(String nome, String cidade,String telefone) {
		this.nome = nome;
		this.cidade = cidade;
		this.telefone = telefone;
	}
	//construto utilizado na classe Dados
	public Filial() {

	}

	@Override
	public String toString() {
		return nome + " " + cidade +" "+ telefone;
	}

	//get e set do Nome
	public String getNome() {
		return nome;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}
	//get e set da Cidade
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	// get e set do Telefone
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	//get e set da arraylist Medicamento
	public ArrayList<Medicamento> getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(ArrayList<Medicamento> medicamento) {
		this.medicamento = medicamento;
	}

	// get e set da arraylist Cosmetico
	public ArrayList<Cosmetico> getCosmetico() {
		return cosmetico;
	}
	public void setCosmetico(ArrayList<Cosmetico> cosmetico) {
		this.cosmetico = cosmetico;
	}
	//set do medicamentoTemp
    public void setMedicamento(Medicamento medicamentoTemp) {
		medicamento.add(medicamentoTemp);
    }
	//set do cosmeticoTemp
    public void setCosmetico(Cosmetico cosmeticoTemp) {
		cosmetico.add(cosmeticoTemp);
    }
}
