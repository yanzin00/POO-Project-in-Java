package controle;

import modelo.*;
import java.util.*;

public class ControleDados {

	private Dados d = new Dados();
	private ArrayList<Filial> filiais = new ArrayList<Filial>();
	private ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
	private ArrayList<Cosmetico> cosmeticos = new ArrayList<Cosmetico>();
	private int pos;
	private int index;
	
	public ControleDados() {
		d.fillWithSomeData();
		medicamentos = d.getEmpresa().getFiliais().get(pos).getMedicamento();
		cosmeticos = d.getEmpresa().getFiliais().get(pos).getCosmetico();
		 
		}

	public ArrayList<Filial> getFiliais() {
		return d.getEmpresa().getFiliais();
	}
	
	public Filial getFilial(int index) {
		return d.getEmpresa().getFiliais().get(index);
	}
	public void setFilial(ArrayList<Filial> filial){
			d.getEmpresa().setFiliais(filial);
	}
	public void setFiliais(ArrayList<Filial> filiais) {
		this.filiais = filiais;
		d.getEmpresa().setFiliais(filiais);
	}	

	public void cadastrarEditarFilial(String nome, String cidade, String telefone,int index) {
		
		Filial filialTemp = new Filial(nome, cidade,telefone);
		
			if(index == d.getEmpresa().getFiliais().size()) { 
			d.getEmpresa().editarCadastrarFilial(index,filialTemp);
			} 
			else {
				Filial filialFinal = d.getEmpresa().getFiliais().get(index);

				filialTemp.setCosmetico(filialFinal.getCosmetico());
				filialTemp.setMedicamento(filialFinal.getMedicamento());
				d.getEmpresa().getFiliais().set(index, filialTemp);

	    	}
	}	
	public void cadastrarEditarMedicamento(String nome, int quantidade, double preco, String validade, String codigoDeBarra, String dosagem, String tipo, int pos, int index){
		Medicamento medicamentoTemp = new Medicamento(nome, quantidade,preco, codigoDeBarra, tipo, validade, dosagem);
		
		
			if(index == d.getEmpresa().getFiliais().get(pos).getMedicamento().size() ) { 
				d.getEmpresa().getFiliais().get(pos).setMedicamento(medicamentoTemp);
			} 
			else {
	
				d.getEmpresa().getFiliais().get(pos).getMedicamento().get(index).setNome(nome);
				d.getEmpresa().getFiliais().get(pos).getMedicamento().get(index).setQuantidade(quantidade);
				d.getEmpresa().getFiliais().get(pos).getMedicamento().get(index).setPreco(preco);
				d.getEmpresa().getFiliais().get(pos).getMedicamento().get(index).setCodigoDeBarra(codigoDeBarra);
				d.getEmpresa().getFiliais().get(pos).getMedicamento().get(index).setTipo(tipo);
				d.getEmpresa().getFiliais().get(pos).getMedicamento().get(index).setValidade(validade);	
				d.getEmpresa().getFiliais().get(pos).getMedicamento().get(index).setDosagem(dosagem);
				System.out.println(index);
	    	}
	}	
	
	public void cadastrarEditarCosmetico(String nome, int quantidade, double preco, String validade, String codigoDeBarra, String volume, String marca, int pos,int index) {
		Cosmetico cosmeticoTemp = new Cosmetico(nome,quantidade,preco,validade,codigoDeBarra,volume,marca);
		
		
			if(index == d.getEmpresa().getFiliais().get(pos).getCosmetico().size()){  
				d.getEmpresa().getFiliais().get(pos).setCosmetico(cosmeticoTemp);
			
			} 
			else {
				d.getEmpresa().getFiliais().get(pos).getCosmetico().get(index).setNome(nome);
				d.getEmpresa().getFiliais().get(pos).getCosmetico().get(index).setQuantidade(quantidade);
				d.getEmpresa().getFiliais().get(pos).getCosmetico().get(index).setPreco(preco);
				d.getEmpresa().getFiliais().get(pos).getCosmetico().get(index).setValidade(validade);	
				d.getEmpresa().getFiliais().get(pos).getCosmetico().get(index).setCodigoDeBarra(codigoDeBarra);
				d.getEmpresa().getFiliais().get(pos).getCosmetico().get(index).setVolume(volume);
				d.getEmpresa().getFiliais().get(pos).getCosmetico().get(index).setMarca(marca);

	    	}
		}	

	public boolean removerFilial(int pos) {
		filiais = d.getEmpresa().getFiliais();
			if (pos >= 0 && pos < filiais.size()) {
				d.getEmpresa().removerFilial(getFiliais().get(pos));
				return true;
			}else{
				return false;
			}
	}

	//gets e sets

	public Dados getD() {
		return d;
	}
	public void setD(Dados d) {
		this.d = d;
	}
	
}
