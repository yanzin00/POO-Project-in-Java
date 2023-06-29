package controle;
import modelo.*;
import java.util.*;

public class ControleDados {
	private Dados d = new Dados();
	private ArrayList<Filial> filiais = new ArrayList<Filial>();
	private ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
	private ArrayList<Cosmetico> cosmeticos = new ArrayList<Cosmetico>();
	

	private int pos;
	
	
	public ControleDados() {
		d.fillWithSomeData();
		filiais = d.getEmpresa().getFiliais();
		medicamentos = d.getEmpresa().getFiliais().get(pos).getMedicamento();
		cosmeticos = d.getEmpresa().getFiliais().get(pos).getCosmetico();
		ArrayList<Cosmetico> cosmeticos = d.getEmpresa().getFiliais().get(pos).getCosmetico();

		}
	public void cadastrarEditarFilial(String nome, String cidade, String telefone,int pos) {
		
		Filial filialTemp = new Filial(nome, cidade,telefone);
		
		if(pos == d.getEmpresa().getFiliais().size()) { 
			d.getEmpresa().setFiliais(filialTemp);
			filiais = d.getEmpresa().getFiliais();
			
		} else {
	
			d.getEmpresa().getFiliais().get(pos).setNome(nome);
			d.getEmpresa().getFiliais().get(pos).setCidade(cidade);
			d.getEmpresa().getFiliais().get(pos).setTelefone(telefone);
	    }
	}	
	public void cadastrarEditarMedicamento(String nome, int quantidade, double preco, String validade, String codigoDeBarra, String dosagem, String tipo, int index) {
		
		Medicamento medicamentoTemp = new Medicamento(nome, quantidade,preco, codigoDeBarra, tipo, validade, dosagem);
		ArrayList<Medicamento> medicamentos = d.getEmpresa().getFiliais().get(pos).getMedicamento();
		
		if(pos == medicamentos.size()) { 
			 d.getEmpresa().getFiliais().get(pos).setMedicamento(medicamentoTemp);
			medicamentos = d.getEmpresa().getFiliais().get(pos).getMedicamento();
			
		} else {
	
			medicamentos.get(pos).setNome(nome);
			medicamentos.get(pos).setQuantidade(quantidade);
			medicamentos.get(pos).setPreco(preco);
			medicamentos.get(pos).setCodigoDeBarra(codigoDeBarra);
			medicamentos.get(pos).setTipo(tipo);
			medicamentos.get(pos).setValidade(validade);	
			medicamentos.get(pos).setDosagem(dosagem);
	    }
	}	
	
	public void cadastrarEditarCosmetico(String nome, int quantidade, double preco, String validade, String codigoDeBarra, String volume, String marca, int index) {
		
		Cosmetico cosmeticoTemp = new Cosmetico(nome,quantidade,preco,validade,codigoDeBarra,volume,marca);
		ArrayList<Cosmetico> cosmeticos = d.getEmpresa().getFiliais().get(pos).getCosmetico();
		
		if(pos == cosmeticos.size()) { 
			 d.getEmpresa().getFiliais().get(pos).setCosmetico(cosmeticoTemp);
			cosmeticos = d.getEmpresa().getFiliais().get(pos).getCosmetico();
			
		} else {
	
			cosmeticos.get(pos).setNome(nome);
			cosmeticos.get(pos).setQuantidade(quantidade);
			cosmeticos.get(pos).setPreco(preco);
			cosmeticos.get(pos).setValidade(validade);	
			cosmeticos.get(pos).setCodigoDeBarra(codigoDeBarra);
			cosmeticos.get(pos).setVolume(volume);
			cosmeticos.get(pos).setMarca(marca);
			
	    }
	}	

	
	public void setEscritorio(Empresa empresa) {
	}
	
	
	public void excluirFilial(int pos) {
		filiais = d.getEmpresa().getFiliais();

		if (pos >= 0 && pos < filiais.size()) {
			filiais.remove(pos);
			d.getEmpresa().setFiliais(filiais);
		}
	}

	public Dados getD() {
		return d;
	}
	public void setD(Dados d) {
		this.d = d;
	}
	public ArrayList<Filial> getFiliais() {
		return filiais;
	}
	public void setFiliais(ArrayList<Filial> filiais) {
		this.filiais = filiais;
		d.getEmpresa().setFiliais(filiais);
	}
	
	public int qtdProd(Dados d){
		int qtdProdutos = 0;
		 for (int i = 0; i < d.getEmpresa().getFiliais().get(qtdProdutos).getMedicamento().size() - 1;i++) {
            qtdProdutos +=d.getEmpresa().getFiliais().get(qtdProdutos).getMedicamento().size() + d.getEmpresa().getFiliais().get(qtdProdutos).getCosmetico().size();
        }
	return qtdProdutos;
	}
	
	
}
