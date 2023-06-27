package modelo;

import java.util.*;

public class Filial {
	private String nome;
	private String cidade;
	private String telefone;
	private ArrayList<Produto> estoque = new ArrayList<Produto>();
	
	
	public Filial(String nome, String cidade,String telefone) {
		this.nome = nome;
		this.cidade = cidade;
		this.telefone = telefone;
		this.estoque = new ArrayList<Produto>();
	}

	public Filial() {
		
	}

	public void cadastraEstoque(Produto prod){
		estoque.add(prod);
	}
	
	public void removeEstoque(Produto prod){
		estoque.remove(prod);
	}
	
	
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
	
	public ArrayList<Produto> getEstoque() {
		return estoque;
	}
	public void setEstoque(ArrayList<Produto> estoque) {
		this.estoque = estoque;
	}
	public String toString() {
		return nome + " " + cidade +" "+ telefone;
	}
	
}