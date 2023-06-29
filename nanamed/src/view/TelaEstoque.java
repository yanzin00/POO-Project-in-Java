package view;

import java.awt.*; 
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

import java.awt.event.*;

public class TelaEstoque implements ActionListener, ListSelectionListener{

	private JFrame jfrm  = new JFrame(	"Estoque");
	private JButton addMed = new JButton("Adicionar Cosmetico");
	private JButton addCos = new JButton("Adicionar Medicamento");
	private JButton salvar = new JButton("salvar");
	private JButton atualizar = new JButton("Atualizar");
	
	private JList<String> estoque;
	private JScrollPane scroll;
	
	private JLabel jlab = new JLabel("Estoque: ");
	private JLabel nome = new JLabel("Nome da filial: ");
	private JLabel cidade = new JLabel("Cidade: ");
	private JLabel telefone = new JLabel("Telefone: ");
	
	private JTextField jtfNome = new JTextField();
	private JTextField jtfCidade = new JTextField();
	private JTextField jtfTelefone = new JTextField();
	private int posicao;
	private String [] listaE;
	
	private ControleDados dados;
	
	public void telaEstoque(int pos, ControleDados dados) {
		
		this.dados = dados;
		this.posicao = pos;
		
		jlab.setFont(new Font("Arial", Font.BOLD, 20));
		jlab.setBounds(10, 10, 150, 30);
		nome.setBounds(250,70,150,30);
		cidade.setBounds(250,115,150,30);
		telefone.setBounds(250,160,150,30);
		
		jtfNome.setBounds(245,90,150,30);
		jtfCidade.setBounds(245,135,150,30);
		jtfTelefone.setBounds(245,180,150,30);
	
		addMed.setBounds(242,10,170,30);
		addCos.setBounds(242,40,170,30);
		salvar.setBounds(292,220,70,30);
		atualizar.setBounds(252,220,70,30);
		
		jfrm.setLayout(null);
		jfrm.setSize(420, 300);
		
		
		listaE = new ControleEstoque(dados,pos).getListaEstoque(dados,pos);
		estoque = new JList<String>(listaE);
		
		System.out.println(listaE);


		estoque.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		estoque.setVisibleRowCount(10);
		
		scroll = new JScrollPane(estoque); 
		scroll.setBounds(10,50,230,200);
		
		jtfNome.setText(dados.getD().getEmpresa().getFiliais().get(pos).getNome());
		jtfCidade.setText(dados.getD().getEmpresa().getFiliais().get(pos).getCidade());
		jtfTelefone.setText(dados.getD().getEmpresa().getFiliais().get(pos).getTelefone());
		
		
		jtfNome.addActionListener(this);
		jtfCidade.addActionListener(this); 
		jtfTelefone.addActionListener(this); 
		
		addMed.addActionListener(this); 
		addCos.addActionListener(this);
		salvar.addActionListener(this);
		atualizar.addActionListener(this);
		
		jfrm.add(jlab);
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
		jfrm.getContentPane().add(scroll);
		
			
		jfrm.setVisible(true);
		
		
	}
	public void valueChanged(ListSelectionEvent e) {
	
		
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		
		if(src == addMed) {
			new TelaEditar(dados, 2);
			}
		if(src == addCos){
			new TelaEditar(dados, 1);
		}
		if(src == salvar) {

			
			String nomeF = jtfNome.getText();
			String cidadeF = jtfCidade.getText();
			String telefoneF = jtfTelefone.getText();
			dados.cadastrarEditarFilial(nomeF, cidadeF, telefoneF,posicao);
			
			JOptionPane.showMessageDialog(salvar, "Dados editados com sucesso!");
			jfrm.dispose();
		}
		if(src == atualizar)
		{
			estoque.setListData(new ControleEstoque(dados,posicao).getListaEstoque(dados,posicao));
			estoque.updateUI();
			
		}		
	}
}
