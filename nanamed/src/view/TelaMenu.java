package view;

import controle.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * Implementa a tela de menu do sistema.
 * 
 * @author Yan Lucas, Felipe Matheus
 * @since 2023
 * @version 1.0
 *
 */

public class TelaMenu implements ActionListener, ListSelectionListener {

  private static JFrame jfrm = new JFrame("interface");
  private static JLabel jlab = new JLabel("Menu Principal");

  private static JButton cadastro = new JButton("Cadastrar Filial");
  private static JButton atualizar = new JButton("Atualizar");
  private static JButton buscarP = new JButton("Buscar Prod.");
  private static JButton buscarF = new JButton("Buscar Filial.");

  private JList<String> list;
  private JScrollPane scroll;
  private String[] listaF;

  private static ControleDados dados = new ControleDados();

  /**
   * Cria o menu principal do sistema
   */

  public TelaMenu() {
    listaF = new ControleFilial(dados).getNomesFiliais();
    list = new JList<String>(listaF);

    jlab.setFont(new Font("Arial", Font.BOLD, 20));
    jlab.setBounds(140, 10, 150, 30);

    cadastro.setBounds(250, 40, 150, 30);
    atualizar.setBounds(250, 80, 150, 30);
    buscarP.setBounds(250, 120, 150, 30);
    buscarF.setBounds(250, 160, 150, 30);

    list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

    scroll = new JScrollPane(list);
    scroll.setBounds(50, 50, 150, 60);

	/**
	 * Istancia os ActionListener
	 */

    cadastro.addActionListener(this);
    list.addListSelectionListener(this);
    atualizar.addActionListener(this);
    buscarP.addActionListener(this);
    buscarF.addActionListener(this);

    jfrm.setSize(420, 300);
    jfrm.setLayout(null);
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    jfrm.add(jlab);
    jfrm.add(atualizar);
    jfrm.add(cadastro);
    jfrm.add(buscarF);
    jfrm.add(buscarP);    
    jfrm.getContentPane().add(scroll);

    jfrm.setVisible(true);
  }

	/**
	 * método que em que mostra a TelaEstoque da filial selecionada
	 * 
	 */
  public void valueChanged(ListSelectionEvent e) {
    Object src = e.getSource();
    if (e.getValueIsAdjusting() && src == list) {
      new TelaEstoque().telaEstoque(list.getSelectedIndex(), dados);
    }
  }

	/**
	 * método que define o que vai acontecer com a ação do usuário
	 */
  public void actionPerformed(ActionEvent e) {
    Object src = e.getSource();


    if (src == cadastro) {
      new TelaCadastroFilial(dados);
    }
    if (src == atualizar) {
      list.setListData(new ControleFilial(dados).getNomesFiliais());
      list.updateUI();
    }
    if (src == buscarP) {
      new TelaBusca(dados);
    }
    if (src == buscarF) {
      new TelaBuscaFilial(dados);
    }
  }
	/**
	 * Método que abre a primeira tela 
	 * @param a string
	 */
  public static void main(String[] a) {
    new TelaMenu();
  }
}
