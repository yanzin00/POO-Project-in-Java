package controle;


import java.util.ArrayList;

import modelo.*;


public class ControleFilial  {
	
	private Filial filial;
	Empresa empresa = new Empresa();
	public ArrayList<Filial> filiais = new ArrayList<Filial>();
	
	
	public ControleFilial(Filial filial) {
		this.filial = filial;
	}
	 public ControleFilial(Dados d, int pos) {
	    	filial = d.getEmpresa().getFiliais().get(pos);
	    	filiais = d.getEmpresa().getFiliais();
	    }
	public ControleFilial(Dados d) {
		filiais = d.getEmpresa().getFiliais();
	}
	public ControleFilial() {

	}
	
	
	public void ctrlCadastrarFilial(String nome, String cidade, String telefone) {
		filial = new Filial();
		filial.setNome(nome);
		filial.setCidade(cidade);
		filial.setTelefone(telefone);
		
		empresa.cadastrarFilial(filial);
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}
	public Filial getFilial() {
		return filial;
	}
	public void setFilial(Filial filial) {
		this.filial = filial;
	}
	public void removerFilial() {
		filial = null;
		empresa.removerFilial(filial);
	}
	
	
	public void editarFilial(String novoNome, String novaCidade, String novoTelefone) {
		filial = new Filial(novoNome, novaCidade, novoTelefone);
		filial.setCidade(novaCidade);
		filial.setNome(novoNome);
		filial.setTelefone(novoTelefone);
	}
	public String[] arrayNomes(Empresa empresa) {
		String[] nomes = new String[empresa.getFiliais().size()];
		int x = 0;
		for (Filial i : empresa.getFiliais()) {
			nomes[x] = i.getNome();
			x++;
		}
		return nomes;
	}
}