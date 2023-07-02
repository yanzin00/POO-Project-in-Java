package modelo;

import java.util.ArrayList;

public class Empresa {
	
	private String nomeEmpresa;
	public ArrayList<Filial> filiais = new ArrayList<Filial>();

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
	public Empresa( String nomeEmpresa, ArrayList<Filial> filiais) {
		
		this.nomeEmpresa = nomeEmpresa;
		this.filiais = filiais;
		}
	
	public Empresa() {
    }
	
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
	// achamos que nao ta sendo utilizado

	public String[] listarFiliais() {
		String[] filiaisListadas = new String[filiais.size()];
		for(int i = 0; i < filiais.size() - 1; i++) {
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
}
