package modelo;

import java.util.ArrayList;

public class Empresa {
	
	private String nomeEmpresa;
	public ArrayList<Filial> filiais = new ArrayList<Filial>();
	Filial filial = new Filial();
	
	
	public Empresa() {
		
		}

	public Empresa( String nomeEmpresa, ArrayList<Filial> filiais) {
		super();
		this.nomeEmpresa = nomeEmpresa;
		this.filiais = filiais;
		}
	
	public void editarCadastrarFilial(int pos, Filial filial) {
		filiais.add(pos, filial);
	}
	
	public String[] listarFiliais() {
		String[] filiaisListadas = new String[filiais.size()];
		for(int i = 0; i < filiais.size(); i++) {
			filiaisListadas[i] = filiais.get(i).getNome();
		}
		return filiaisListadas;
	}
	
	public void cadastrarFilial(Filial filial) {
		filiais.add(filial);
		
	}
	
	public void removerFilial(Filial filial) {
		filiais.remove(filial);
	}
	public String toString() {
		return nomeEmpresa + filiais;
	}
	
	
	public void setFiliais(ArrayList<Filial> filiais) {
		this.filiais = filiais;
	}
	
	public  ArrayList<Filial> getFiliais() {
		return filiais;
	}
	
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public void setFiliais(Filial filialTemporaria) {
		filiais.add(filialTemporaria);
		
	}
	

}