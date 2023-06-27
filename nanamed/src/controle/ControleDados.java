package controle;
import modelo.*;
import java.util.*;

public class ControleDados {
	private Dados d;
	private Empresa empresa = new Empresa();
	private Filial filial = new Filial();
	private ArrayList<Filial> filiais = new ArrayList<Filial>();
	
	public ControleDados() {
		d = new Dados();
	}
	
	public Dados getDados() {
		return d;
	}
	public void setDados(Dados d) {
		this.d = d;
	}
	
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
	public void setEscritorio(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
	public void excluirFilial(int pos) {
		filiais = empresa.getFiliais();

		if (pos >= 0 && pos < filiais.size()) {
			filiais.remove(pos);
		}
	}
}
