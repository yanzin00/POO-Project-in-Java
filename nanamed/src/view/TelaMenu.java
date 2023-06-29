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
	private static JButton atualizar = new JButton("Atualizar");

	
	private JList<String> list;
	private JScrollPane scroll;
	private String[] listaF;

	private static ControleDados dados = new ControleDados();


	
	
	public TelaMenu(){
		
	
		listaF = new ControleFilial(dados).getNomesFiliais();
		list = new JList<String>(listaF);	
	
	System.out.println(dados.getD().getEmpresa().getFiliais().get(0).getCosmetico());

		jlab.setFont(new Font("Arial", Font.BOLD, 20));
		jlab.setBounds(140, 10, 150, 30);
		
		cadastro.setBounds(262,40,150,30);
		atualizar.setBounds(262,80,150,30);
		
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION); 
	
		scroll = new JScrollPane(list); 
		scroll.setBounds(50,50,150,60);
		
		
	



		cadastro.addActionListener(this); 
		list.addListSelectionListener(this); 
		atualizar.addActionListener(this);

		jfrm.setSize(420, 300);
		jfrm.setLayout(null);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		jfrm.add(jlab);  
		jfrm.add(atualizar);
		jfrm.add(cadastro);
		jfrm.getContentPane().add(scroll);

		
	
	jfrm.setVisible(true);
		

		
		
	}

	public void valueChanged(ListSelectionEvent e) {  
		
		Object src = e.getSource();
		if(e.getValueIsAdjusting() && src == list) {
			
			new TelaEstoque().telaEstoque(list.getSelectedIndex(), dados);
			
		}
	}
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();	
		
		if(src == cadastro) {
			new TelaCadastroFilial(dados);
		}
		if(src == atualizar)
		{
			list.setListData(new ControleFilial(dados).getNomesFiliais());
			list.updateUI();
			
		}	
			
			
	} 	
	
	public static void main(String[] a) { 
		new TelaMenu();	
	}
	
}
