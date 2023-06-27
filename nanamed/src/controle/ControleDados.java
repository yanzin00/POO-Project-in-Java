package controle;
import modelo.*;
import java.util.*;

public class ControleDados {
	private Dados d = new Dados();
	private Empresa empresa = new Empresa();
	private Filial filial = new Filial();
	private ArrayList<Filial> filiais = new ArrayList<Filial>();
	private int pos;
	
	
	public ControleDados() {
		d.fillWithSomeData();
		filiais = d.getEmpresa().getFiliais();
		}
	public void cadastrarEditarFilial(String nome, String cidade, String telefone) {
		
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
	
	/*
	public void cadastrarEditarFilial(String nome, String endereco, String tel, int pos) {
		Filial filialTemporaria = new Filial(nome, endereco,tel);
		if (pos == empresa.getFiliais().size()) {
			empresa.setFiliais(filialTemporaria);
		} else {
			empresa.getFiliais().get(pos).setNome(nome);
			empresa.getFiliais().get(pos).setCidade(endereco);
			empresa.getFiliais().get(pos).setTelefone(tel);
		}

	}
	*/
	public void setEscritorio(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
	public void excluirFilial(int pos) {
		filiais = empresa.getFiliais();

		if (pos >= 0 && pos < filiais.size()) {
			filiais.remove(pos);
			d.getEmpresa().setFiliais(filiais);
		}
	}
	public String[] arrayNomes(String f) {
		String[] nomes = new String[d.getEmpresa().getFiliais().size()];
		int x = 0;
		for (Filial i : d.getEmpresa().getFiliais()) {
			nomes[x] = i.getNome();
			x++;
		}
		return nomes;
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
	
	
	
	
}
