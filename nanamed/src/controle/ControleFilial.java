package controle;


import java.util.ArrayList;

import modelo.*;


public class ControleFilial  {
	
	Empresa empresa = new Empresa();
	public ArrayList<Filial> filiais = new ArrayList<Filial>();
	
	
	
	public ControleFilial(ControleDados cd) {
		filiais = cd.getD().getEmpresa().getFiliais();
		
	}

	public ArrayList<Filial> getFiliais() {
		return filiais;
	}



	public void setFiliais(ArrayList<Filial> filiais) {
		this.filiais = filiais;
	}
	
	public int getQtF() {
		return filiais.size();
	}
	
	public String[] getNomesFiliais() {
		String[] nomes = new String[filiais.size()];
		
		for (int i = 0; i < filiais.size(); i++) {
			nomes[i] = filiais.get(i).getNome();
		}
		
		return nomes;
	}
}


