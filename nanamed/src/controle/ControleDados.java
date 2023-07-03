package controle;

import java.util.*;
import modelo.*;
/**
	 * Classe que faz a ponte entre view e model, com métodos feitos em relação aos dados a serem registrados
   * ou que já foram registrados.
   * 
	 * @author Yan Lucas, Felipe Matheus
	 * @since 2023
	 * @version 1.0
	 */

public class ControleDados {

  private Dados d = new Dados();
  private ArrayList<Filial> filiais = new ArrayList<Filial>();
  private ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
  private ArrayList<Cosmetico> cosmeticos = new ArrayList<Cosmetico>();
  private int pos;
  private int index;

  //implementa os dados cadastrados 
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

  public void setFilial(ArrayList<Filial> filial) {
    d.getEmpresa().setFiliais(filial);
  }

  public void setFiliais(ArrayList<Filial> filiais) {
    this.filiais = filiais;
    d.getEmpresa().setFiliais(filiais);
  }
  
  
  /**
   * A função cadastrarEditarFilial() é usada para adição/edição de filiais.
   * 
   * @param nome Nome da filial.
   * @param cidade Cidade da Filial.
   * @param telefone Telefone da filial.
   * @param index Índice da nova filial.
   */
  public boolean cadastrarEditarFilial(String nome, String cidade, String telefone, int index) {
		if (!telefone.matches("[0-9]+")) {
			return false;
		} else {
  
    Filial filialTemp = new Filial(nome, cidade, telefone);

    if (index == d.getEmpresa().getFiliais().size()) {
      d.getEmpresa().editarCadastrarFilial(index, filialTemp);
    } else {
      Filial filialFinal = d.getEmpresa().getFiliais().get(index);

      filialTemp.setCosmetico(filialFinal.getCosmetico());
      filialTemp.setMedicamento(filialFinal.getMedicamento());
      d.getEmpresa().getFiliais().set(index, filialTemp);
    }
  	return true;
	}
	}

  /**
   * A função "cadastrarEditarMedicamento" é usada para a adição/edição de medicamentos.
   * 
   * @param nome Nome do mediicamento.
   * @param quantidade Quantidade de medicamentos no registro.
   * @param preco Preço do medicamento.
   * @param validade Validade do medicamento.
   * @param codigoDeBarra Código de barras do medicamento.
   * @param dosagem Dosagem do medicamento
   * @param tipo Tipo de medicamento.
   * @param pos Posição da filial.
   * @param index É o índice da medicação. Usado para definir se será colocada em uma nova posição ou sobrescrever
   * outra medicação.
   */
  public void cadastrarEditarMedicamento(String nome,int quantidade,double preco,String validade,String codigoDeBarra,String dosagem,String tipo,
    int pos,int index) {
    Medicamento medicamentoTemp = new Medicamento(nome,quantidade,preco,codigoDeBarra,tipo,validade,dosagem);

    if (index == d.getEmpresa().getFiliais().get(pos).getMedicamento().size()) {
      d.getEmpresa().getFiliais().get(pos).setMedicamento(medicamentoTemp);
    } else {
      d
        .getEmpresa()
        .getFiliais()
        .get(pos)
        .getMedicamento()
        .get(index)
        .setNome(nome);
      d
        .getEmpresa()
        .getFiliais()
        .get(pos)
        .getMedicamento()
        .get(index)
        .setQuantidade(quantidade);
      d
        .getEmpresa()
        .getFiliais()
        .get(pos)
        .getMedicamento()
        .get(index)
        .setPreco(preco);
      d
        .getEmpresa()
        .getFiliais()
        .get(pos)
        .getMedicamento()
        .get(index)
        .setCodigoDeBarra(codigoDeBarra);
      d
        .getEmpresa()
        .getFiliais()
        .get(pos)
        .getMedicamento()
        .get(index)
        .setTipo(tipo);
      d
        .getEmpresa()
        .getFiliais()
        .get(pos)
        .getMedicamento()
        .get(index)
        .setValidade(validade);
      d
        .getEmpresa()
        .getFiliais()
        .get(pos)
        .getMedicamento()
        .get(index)
        .setDosagem(dosagem);
     
    }
  }

  /**
   * The function `cadastrarEditarCosmetico` is used to add or edit a cosmetic product in a company's
   * branch.
   * 
   * @param nome Nome do produto.
   * @param quantidade Quantidade do produto.
   * @param preco Preço do produto.
   * @param validade  Validade do produto.
   * @param codigoDeBarra  Codigo de barra do produto.
   * @param volume Volume do produto.
   * @param marca Marca do produto
   * @param pos Posição do filial escolhida.
   * @param index Posição do produto.
   */
  public void cadastrarEditarCosmetico(
    String nome,
    int quantidade,
    double preco,
    String validade,
    String codigoDeBarra,
    String volume,
    String marca,
    int pos,
    int index
  ) {
    Cosmetico cosmeticoTemp = new Cosmetico(
      nome,
      quantidade,
      preco,
      validade,
      codigoDeBarra,
      volume,
      marca
    );

    if (index == d.getEmpresa().getFiliais().get(pos).getCosmetico().size()) {
      d.getEmpresa().getFiliais().get(pos).setCosmetico(cosmeticoTemp);
    } else {
      d
        .getEmpresa()
        .getFiliais()
        .get(pos)
        .getCosmetico()
        .get(index)
        .setNome(nome);
      d
        .getEmpresa()
        .getFiliais()
        .get(pos)
        .getCosmetico()
        .get(index)
        .setQuantidade(quantidade);
      d
        .getEmpresa()
        .getFiliais()
        .get(pos)
        .getCosmetico()
        .get(index)
        .setPreco(preco);
      d
        .getEmpresa()
        .getFiliais()
        .get(pos)
        .getCosmetico()
        .get(index)
        .setValidade(validade);
      d
        .getEmpresa()
        .getFiliais()
        .get(pos)
        .getCosmetico()
        .get(index)
        .setCodigoDeBarra(codigoDeBarra);
      d
        .getEmpresa()
        .getFiliais()
        .get(pos)
        .getCosmetico()
        .get(index)
        .setVolume(volume);
      d
        .getEmpresa()
        .getFiliais()
        .get(pos)
        .getCosmetico()
        .get(index)
        .setMarca(marca);
    }
  }

 /**
  * Remove uma filial da função especificada.
  * 
  * @param pos Posição da filial a ser removida.
  */
  public boolean removerFilial(int pos) {
    filiais = d.getEmpresa().getFiliais();
    if (pos >= 0 && pos < filiais.size()) {
      d.getEmpresa().removerFilial(getFiliais().get(pos));
      return true;
    } else {
      return false;
    }
  }

  // gets e sets

  public Dados getD() {
    return d;
  }

  public void setD(Dados d) {
    this.d = d;
  }
}
