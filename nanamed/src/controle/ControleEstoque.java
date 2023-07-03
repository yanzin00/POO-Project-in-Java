package controle;

import java.util.*;
import modelo.*;

/**
	 * Classe que faz a ponte entre view e model, com métodos feitos em relação ao estoque.
   * 
	 * @author Yan Lucas, Felipe Matheus
	 * @since 2023
	 * @version 1.0
	 */

public class ControleEstoque {

  public ControleDados dados = new ControleDados();
  private ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
  private ArrayList<Cosmetico> cosmeticos = new ArrayList<Cosmetico>();

  public ControleEstoque(ControleDados d) {
    for (int i = 0; i < d.getD().getEmpresa().getFiliais().size(); i++) {
      for (
        int j = 0;
        j < d.getD().getEmpresa().getFiliais().get(i).getCosmetico().size();
        j++
      ) {
        cosmeticos.add(
          d.getD().getEmpresa().getFiliais().get(i).getCosmetico().get(j)
        );
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

 /**
  * Retorna uma Array com todos os produtos da filial selecionada.
  * 
  * @param d Dados.
  * @param pos Posição da filial.
  * @return Retorna o estoque da filial.
  */
  public String[] getListaEstoque(ControleDados d, int pos) {
    ArrayList<Medicamento> medicamentos = d
      .getD()
      .getEmpresa()
      .getFiliais()
      .get(pos)
      .getMedicamento();
    ArrayList<Cosmetico> cosmeticos = d
      .getD()
      .getEmpresa()
      .getFiliais()
      .get(pos)
      .getCosmetico();
    int sizeMedCos = cosmeticos.size() + medicamentos.size();

    String[] meds = new String[20];
    String[] cosm = new String[20];
    String[] estoque = new String[50];

    for (int i = 0; i < medicamentos.size(); i++) {
      meds[i] = medicamentos.get(i).toString();
      estoque[i] = medicamentos.get(i).toString();
    }
    for (int i = 0; i < cosmeticos.size(); i++) {
      cosm[i] = cosmeticos.get(i).toString();
      estoque[i + medicamentos.size()] = cosmeticos.get(i).toString();
    }

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

  /**
   * A função "procurarMed" procura por um medicamento dado seu nome em uma lista, caso não ache retorna -1.
   * 
   * @param busca Medicamento a ser procurado.
   * @return Retorna -1 caso a busca falhe, retorna o indíce do produto caso o encontre.
   */
  public int procurarMed(String busca) {
    int i = 0;
    for (Medicamento med : medicamentos) {
      if (med.getNome().equals(busca)) {
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
