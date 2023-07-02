package controle;

import java.util.*;
import modelo.*;

public class ControleEstoque {

	public ControleDados dados = new ControleDados();	
	private ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
	private ArrayList<Cosmetico> cosmeticos = new ArrayList<Cosmetico>();
	

	public ControleEstoque(ControleDados d) {

		for (int i = 0; i < d.getD().getEmpresa().getFiliais().size() ; i++) {
			for (int j = 0; j < d.getD().getEmpresa().getFiliais().get(i).getCosmetico().size() ; j++) {
				cosmeticos.add(d.getD().getEmpresa().getFiliais().get(i).getCosmetico().get(j));
			}

		}
	}

	
	public ControleEstoque(ControleDados d, int pos) {
		medicamentos = d.getD().getEmpresa().getFiliais().get(pos).getMedicamento();
		cosmeticos = d.getD().getEmpresa().getFiliais().get(pos).getCosmetico();
	}

	public void setMedicamento(ArrayList<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public String[] getListaEstoque(ControleDados d, int pos) {

		ArrayList<Medicamento> medicamentos = d.getD().getEmpresa().getFiliais().get(pos).getMedicamento();
		ArrayList<Cosmetico> cosmeticos = d.getD().getEmpresa().getFiliais().get(pos).getCosmetico();
		int sizeMedCos = cosmeticos.size() + medicamentos.size();


		System.out.println("############################");
		System.out.println(medicamentos.size());
		System.out.println(cosmeticos.size());
		System.out.println("****************************");
		System.out.println(sizeMedCos);

		String[] meds = new String[20];
		String[] cosm = new String[20];
		String[] estoque = new String[50];

		for (int i = 0; i < medicamentos.size() ; i++) {
			meds[i] = medicamentos.get(i).toString();
			estoque[i] = medicamentos.get(i).toString();
		}
		for (int i = 0; i < cosmeticos.size(); i++) {
			cosm[i] = cosmeticos.get(i).toString();
			estoque[i+medicamentos.size()] = cosmeticos.get(i).toString();
		}

		

		System.out.println("--------------------------");
		System.out.println(meds.length);
		System.out.println(cosm.length);
		
		return estoque;
	}

	// gets e sets

	public ArrayList<Cosmetico> getCosmeticos() {
		return cosmeticos;
	}

	public void setCosmeticos(ArrayList<Cosmetico> cosmeticos) {
		this.cosmeticos = cosmeticos;
	}


	public ArrayList<Medicamento> getMedicamento() {
		return medicamentos;
	}

	public int procurarMed(String busca){

		int i = 0;
		for(Medicamento med : medicamentos){
			if(med.getNome().equals(busca)){
				return i;
			}
			i++;
		}
		return -1;
	}	


	public int getQtdMedicamento() {
		return medicamentos.size();
	}

}
