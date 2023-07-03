package modelo;

import java.util.ArrayList;

/**
 * Classe Empresa onde se tem o CRUD empresa e suas informações
 * @author Yan Lucas, Felipe Matheus
 * @since 2023
 * @version 1.0
 * @see nomeEmpresa nome da Empresa
 
 */

public class Empresa {
	
	private String nomeEmpresa;
	public ArrayList<Filial> filiais = new ArrayList<Filial>();

	/**
     * Método toString() da classe Empresa. Constroi uma String contendo o valor de todas as váriaveis da classe Empresa.
     * @return String
     */
	
	public String toString() {
		return nomeEmpresa + filiais;
	}
	// construtor para poder chamar nas outras classes
	public Empresa() {
    }
	
	/**
	 * Método para editar e cadastrar as filiais 
	 * @param pos 		posição da filial na ArrayList
	 * @param filial 		parametro usado para se editar e cadastrar 
	 */
    public void editarCadastrarFilial(int pos, Filial filial) {
		if (pos == filiais.size()) {
			filiais.add(filial);
		} else {
			filiais.get(pos).setNome(filial.getNome());
			filiais.get(pos).setCidade(filial.getCidade());
			filiais.get(pos).setTelefone(filial.getTelefone());
			filiais.get(pos).setCosmetico(filial.getCosmetico());
			filiais.get(pos).setMedicamento(filial.getMedicamento());
		}
	}
	
	//cadastrar a filial nova
	public void cadastrarFilial(Filial filial) {
		filiais.add(filial);
		
	}
	
	//remover filial registrada
	public void removerFilial(Filial filial) {
		filiais.remove(filial);
	}

	//get e set da filiais
	public void setFiliais(ArrayList<Filial> filiais) {
		this.filiais = filiais;
	}
	
	public  ArrayList<Filial> getFiliais() {
		return filiais;
	}
	
	//get e set do nome da empresa
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	// set da filial temporaria
	public void setFiliais(Filial filialTemporaria) {
		filiais.add(filialTemporaria);
		
	}

	
		
}
