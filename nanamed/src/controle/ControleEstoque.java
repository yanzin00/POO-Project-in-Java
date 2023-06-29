package controle;

import java.util.*;
import modelo.*;


public class ControleEstoque {




	public ControleDados dados = new ControleDados();	
	private ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
	private ArrayList<Cosmetico> cosmeticos = new ArrayList<Cosmetico>();
	
	
	public ControleEstoque(ControleDados d, int pos) {
		medicamentos = d.getD().getEmpresa().getFiliais().get(pos).getMedicamento();
		cosmeticos = d.getD().getEmpresa().getFiliais().get(pos).getCosmetico();
	}

	public ControleEstoque(ControleDados d) {
		for (int i = 0; i < d.getD().getEmpresa().getFiliais().size(); i++) {
			for (int j = 0; j < d.getD().getEmpresa().getFiliais().get(i).getMedicamento().size() ||
					j < d.getD().getEmpresa().getFiliais().get(i).getCosmetico().size(); j++) 
			{
				medicamentos.add(d.getD().getEmpresa().getFiliais().get(i).getMedicamento().get(j));
				cosmeticos.add(d.getD().getEmpresa().getFiliais().get(i).getCosmetico().get(j));
			}
		}
	}
	public ArrayList<Cosmetico> getCosmeticos() {
		return cosmeticos;
	}

	public void setCosmeticos(ArrayList<Cosmetico> cosmeticos) {
		this.cosmeticos = cosmeticos;
	}


	public ArrayList<Medicamento> getMedicamento() {
		return medicamentos;
	}

	public int getQtdMedicamento() {
		return medicamentos.size();
	}

	public void setMedicamento(ArrayList<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}
	
	public String[] getNomesMed() {
		String[] nomes = new String[medicamentos.size()+cosmeticos.size()];

		for (int i = 0; i < medicamentos.size() || i < cosmeticos.size(); i++) {
			nomes[i] = medicamentos.get(i).getNome();
			nomes[i] = cosmeticos.get(i).getNome();
		}
		
		return nomes;
	}


	
	
	/* public ControleEstoque(ControleDados dados) {
		medicamentos = dados.getD().getEmpresa().getFiliais().get(pos).getMedicamento();
		cosmeticos = dados.getD().getEmpresa().getFiliais().get(pos).getCosmetico();
	}*/
	
	public String[] getListaEstoque() {
		String[] listaMed = new String[medicamentos.size()];
		String[] listaCos = new String[cosmeticos.size()];
		String[] listaEst = new String[medicamentos.size()+cosmeticos.size()];
		
		for(int i = 0; i < medicamentos.size() || i < cosmeticos.size();i++){
			listaMed[i] = new ControleFilial(dados).empresa.filiais.get(i).getMedicamento().toString();
			listaCos[i] = new ControleFilial(dados).empresa.filiais.get(i).getCosmetico().toString();
		}
		return listaMed;
	}
}
