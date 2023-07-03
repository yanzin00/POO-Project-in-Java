package view;
import controle.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * Implementa a interface que busca a filial dado sua cidade..
 * 
 * @author Yan Lucas, Felipe Matheus
 * @since 2023
 * @version 1.0
 *
 */


public class TelaBuscaFilial implements ActionListener, ListSelectionListener{
	
    private static JFrame jfrm = new JFrame("TelaBuscaFilial");
	private static JLabel jlab = new JLabel("Buscar");
	private static JTextField jtfBusca = new JTextField();
	
	private static JButton buscar = new JButton("Buscar Filial");
	
	private JList<String> list;
	private JScrollPane scroll;

    private int pos;
    private String[] listaF;

	private static ControleDados dados = new ControleDados();
	
	public TelaBuscaFilial(ControleDados dados) {
		
		//Pega todas as filiais
        listaF = new ControleFilial(dados).getNomesFiliais();
        list = new JList<String>(listaF);

		jlab.setFont(new Font("Arial", Font.BOLD, 20));
		jlab.setBounds(100, 10, 175, 30);
		
        buscar.setBounds(175,10,150,30);


		jtfBusca.setBounds(175,50,150,30);
		
		
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION); 
	
		scroll = new JScrollPane(list); 
		scroll.setBounds(100,100,300,300);



		jtfBusca.addActionListener(this); 
		list.addListSelectionListener(this); 
	    buscar.addActionListener(this);
	

		jfrm.setSize(500, 500);
		jfrm.setLayout(null);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		jfrm.add(jlab);  
		jfrm.add(jtfBusca);
		jfrm.getContentPane().add(scroll);
        jfrm.add(buscar);
	
	    jfrm.setVisible(true);
		

		
		
	}

	public void valueChanged(ListSelectionEvent e) {  
		
		Object src = e.getSource();
		if(e.getValueIsAdjusting() && src == list) {
		}
	}
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();	
		
        // Retorna o parâmetro de de retorno de procurarMed(). Não implementado foi implementado por
		// completo.
        
		if(src == buscar)
		{
			String nomeBusca = jtfBusca.getText();
            int b;
            
            b = new ControleEstoque(dados).procurarMed(nomeBusca);
                if(b != -1)
            {
                    System.out.println(b);
            }
		}			
	} 	
}

