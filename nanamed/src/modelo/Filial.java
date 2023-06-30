package modelo;

import java.util.*;

public class Filial {

	private String nome;
	private String cidade;
	private String telefone;
	private ArrayList<Medicamento> medicamento = new ArrayList<Medicamento>();
	private ArrayList<Cosmetico> cosmetico = new ArrayList<Cosmetico>();
	
	public Filial(String nome, String cidade,String telefone) {
		this.nome = nome;
		this.cidade = cidade;
		this.telefone = telefone;
	}

	public Filial() {

	}

	public String toString() {
		return nome + " " + cidade +" "+ telefone;
	}

	// gets e sets

	public String getNome() {
		return nome;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public ArrayList<Medicamento> getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(ArrayList<Medicamento> medicamento) {
		this.medicamento = medicamento;
	}

	public ArrayList<Cosmetico> getCosmetico() {
		return cosmetico;
	}

	public void setCosmetico(ArrayList<Cosmetico> cosmetico) {
		this.cosmetico = cosmetico;
	}

    public void setMedicamento(Medicamento medicamentoTemp) {
		medicamento.add(medicamentoTemp);
    }

    public void setCosmetico(Cosmetico cosmeticoTemp) {
		cosmetico.add(cosmeticoTemp);
    }
}
