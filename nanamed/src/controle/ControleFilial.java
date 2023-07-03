package controle;

import java.util.ArrayList;
import modelo.*;

/**
	 * Classe que faz a ponte entre view e model, com métodos feitos em relação as filiais.
   * 
	 * @author Yan Lucas, Felipe Matheus
	 * @since 2023
	 * @version 1.0
	 */

public class ControleFilial {

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

  // O método getNomesFiliais() retorna uma array com os nomes das filiais.

  public String[] getNomesFiliais() {
    String[] nomes = new String[filiais.size()];

    for (int i = 0; i < filiais.size(); i++) {
      nomes[i] = filiais.get(i).getNome();
    }

    return nomes;
  }
}
