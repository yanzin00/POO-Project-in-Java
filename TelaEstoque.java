package view;

import java.awt.*; 
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

import java.awt.event.*;

public class TelaEstoque implements ActionListener, ListSelectionListener{

	private JFrame jfrm  = new JFrame("Estoque");
	private static JButton editF = new JButton("editar estoque");
	private static JButton salvar = new JButton("salvar");
	
	private JList<String> estoque;
	private JScrollPane scroll;
	
	private JLabel jlab = new JLabel("Estoque: ");
	private JLabel nome = new JLabel("Nome da filial: ");
	private JLabel cidade = new JLabel("Cidade: ");
	private JLabel telefone = new JLabel("Telefone: ");
	
	private JTextField jtfNome = new JTextField();
	private JTextField jtfCidade = new JTextField();
	private JTextField jtfTelefone = new JTextField();
	
	private static ControleDados dados;
	
	public void telaEstoque(int pos, ControleDados dados) {
		
		this.dados = dados;
		jlab.setFont(new Font("Arial", Font.BOLD, 20));
		jlab.setBounds(10, 10, 150, 30);
		nome.setBounds(250,70,150,30);
		cidade.setBounds(250,115,150,30);
		telefone.setBounds(250,160,150,30);
		
		jtfNome.setBounds(245,90,150,30);
		jtfCidade.setBounds(245,135,150,30);
		jtfTelefone.setBounds(245,180,150,30);
	
		editF.setBounds(262,40,150,30);
		salvar.setBounds(262,220,150,30);
		
		jfrm.setLayout(null);
		jfrm.setSize(420, 300);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		estoque = new JList<>();
		estoque.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		estoque.setVisibleRowCount(10);
		
		scroll = new JScrollPane(estoque); 
		scroll.setBounds(10,50,230,200);
		
		
		
		
		jtfNome.addActionListener(this);
		jtfCidade.addActionListener(this); 
		jtfTelefone.addActionListener(this); 
		editF.addActionListener(this); 
		salvar.addActionListener(this);
		
		jfrm.add(jlab);
		jfrm.add(nome);
		jfrm.add(cidade);
		jfrm.add(telefone);
		
		jfrm.add(jtfNome);
		jfrm.add(jtfCidade);
		jfrm.add(jtfTelefone);
		
		jfrm.add(editF);
		jfrm.add(salvar);
		jfrm.getContentPane().add(scroll);
		
			
		jfrm.setVisible(true);
		
		
	}
	public void valueChanged(ListSelectionEvent e) {
	
		
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		
		if(src == editF)
			new TelaEditar();	
	}
}