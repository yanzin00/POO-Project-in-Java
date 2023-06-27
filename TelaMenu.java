package view;


import controle.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TelaMenu implements ActionListener, ListSelectionListener{
	private static JFrame jfrm = new JFrame("interface");
	private static JLabel jlab = new JLabel("Menu Principal");
	
	
	private static JButton cadastro = new JButton("Cadastrar Filial");	
	
	private JList<String> list;
	private JScrollPane scroll;


	private ControleFilial cf = new ControleFilial();
	private ControleDados dados = new ControleDados();
	

	

	
	
	public TelaMenu(){
		
		
		list = new JList<String>(cf.arrayNomes(dados.getDados().getEmpresa()));
		

		jlab.setFont(new Font("Arial", Font.BOLD, 20));
		jlab.setBounds(140, 10, 150, 30);
		
		jfrm.setSize(420, 300);
		
		
		cadastro.setBounds(262,40,150,30);
		
		
		
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION); 
	
		scroll = new JScrollPane(list); 
		scroll.setBounds(50,50,150,60);
		
		
	
		cadastro.addActionListener(this); 
		list.addListSelectionListener(this); 


		jfrm.setLayout(null);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		
		
		jfrm.add(jlab);  
		
		jfrm.add(cadastro);
		jfrm.getContentPane().add(scroll);
		
	
	jfrm.setVisible(true);
		

		
		
	}

	public void valueChanged(ListSelectionEvent e) {  
		
		Object src = e.getSource();
		if(e.getValueIsAdjusting() && src == list) {
			
			new TelaEstoque().telaEstoque(list.getSelectedIndex(), dados);
			jfrm.dispose();
		}
	}
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();	
		
		if(src == cadastro)
			new TelaCadastroFilial();
		jfrm.dispose();
	} 
	
	
	public static void main(String[] a) { 
		new TelaMenu();	
	}
}