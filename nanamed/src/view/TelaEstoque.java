package view;

import controle.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * Tela que apresenta o estoque da filial selecionada e dá a possibiladade de adicionar
 * novos produtos. Também edita os parâmetros da filial escolhida, ou  a exclui.
 * 
 * @author Yan Lucas Souza Guimarães
 * @author Felipe Matheus Ribeiro Lopes
 * @since 2023
 * @version 1.0
 *
 */

public class TelaEstoque implements ActionListener{

  private JFrame jfrm = new JFrame("Estoque");
  private JButton addMed = new JButton("Adicionar Medicamento");
  private JButton addCos = new JButton("Adicionar Cosmetico");
  private JButton salvar = new JButton("salvar edit");
  private JButton atualizar = new JButton("Atualizar");
  private JButton excluir = new JButton("Excluir filial");

  private JList<String> estoque;
  private JScrollPane scroll;

  private JLabel jlab = new JLabel("Estoque: ");
  private JLabel jlab2 = new JLabel("Editar filial: ");
  private JLabel nome = new JLabel("Nome da filial: ");
  private JLabel cidade = new JLabel("Cidade: ");
  private JLabel telefone = new JLabel("Telefone: ");

  private JTextField jtfNome = new JTextField();
  private JTextField jtfCidade = new JTextField();
  private JTextField jtfTelefone = new JTextField();
  private int pos;
  private String[] listaE;

  private ControleDados dados;

  /**
   * Cria uma interface para o gerenciametno do estoque.
   * 
   * @param pos Posição da filial selecionada.
   * @param dados Dados utilizados.
   */

  public void telaEstoque(int pos, ControleDados dados) {
    this.dados = dados;
    this.pos = pos;

    jlab.setFont(new Font("Arial", Font.BOLD, 20));
    jlab.setBounds(10, 210, 150, 30);

    jlab2.setFont(new Font("Arial", Font.BOLD, 20));
    jlab2.setBounds(10, 5, 150, 30);

    nome.setBounds(10, 30, 150, 30);
    cidade.setBounds(10, 80, 150, 30);
    telefone.setBounds(10, 130, 150, 30);

    jtfNome.setBounds(8, 55, 150, 30);
    jtfCidade.setBounds(8, 105, 150, 30);
    jtfTelefone.setBounds(8, 155, 150, 30);

    addMed.setBounds(292, 10, 170, 30);
    addCos.setBounds(292, 40, 170, 30);
    salvar.setBounds(10, 185, 120, 30);
    atualizar.setBounds(290, 220, 90, 30);
    excluir.setBounds(292, 100, 100, 30);

    jfrm.setLayout(null);
    jfrm.setSize(800, 500);

    listaE = new ControleEstoque(dados, pos).getListaEstoque(dados, pos);
    estoque = new JList<String>(listaE);

    estoque.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    estoque.setVisibleRowCount(10);

    scroll = new JScrollPane(estoque);
    scroll.setBounds(10, 250, 780, 200);

    jtfNome.setText(dados.getD().getEmpresa().getFiliais().get(pos).getNome());
    jtfCidade.setText(
      dados.getD().getEmpresa().getFiliais().get(pos).getCidade()
    );
    jtfTelefone.setText(
      dados.getD().getEmpresa().getFiliais().get(pos).getTelefone()
    );

    jtfNome.addActionListener(this);
    jtfCidade.addActionListener(this);
    jtfTelefone.addActionListener(this);

    addMed.addActionListener(this);
    addCos.addActionListener(this);
    salvar.addActionListener(this);
    atualizar.addActionListener(this);
    excluir.addActionListener(this);

    jfrm.add(jlab);
    jfrm.add(jlab2);
    jfrm.add(nome);
    jfrm.add(cidade);
    jfrm.add(telefone);

    jfrm.add(jtfNome);
    jfrm.add(jtfCidade);
    jfrm.add(jtfTelefone);

    jfrm.add(addCos);
    jfrm.add(addMed);
    jfrm.add(salvar);
    jfrm.add(atualizar);
    jfrm.add(excluir);
    jfrm.getContentPane().add(scroll);

    jfrm.setVisible(true);
  }
  public void actionPerformed(ActionEvent e) {
   // Maneja as ações dos botões. AddMed adiciona medicamentos e AddCos, cosméticos.

    Object src = e.getSource();

    if (src == addMed) {
      new TelaCadastroProduto(
        dados,
        1,
        pos,
        dados.getD().getEmpresa().getFiliais().get(pos).getMedicamento().size()
      );
    }
    if (src == addCos) {
      new TelaCadastroProduto(
        dados,
        2,
        pos,
        dados.getD().getEmpresa().getFiliais().get(pos).getCosmetico().size()
      );
    }
    if (src == salvar) {
      String nomeF = jtfNome.getText();
      String cidadeF = jtfCidade.getText();
      String telefoneF = jtfTelefone.getText();
      dados.cadastrarEditarFilial(nomeF, cidadeF, telefoneF, pos);

      JOptionPane.showMessageDialog(salvar, "Dados editados com sucesso!");
      jfrm.dispose();
    }
    if (src == atualizar) {
      estoque.setListData(
        new ControleEstoque(dados, pos).getListaEstoque(dados, pos)
      );
      estoque.updateUI();
    }
    if (src == excluir) {
      dados.removerFilial(pos);
      JOptionPane.showMessageDialog(excluir, "Filial removida com sucesso!");
      jfrm.dispose();
    }
  }
}
