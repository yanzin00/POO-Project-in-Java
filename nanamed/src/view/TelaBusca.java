
package view;
import controle.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 * Tela de busca de produtos. 
 * 
 * @author Yan Lucas Souza Guimarães
 * @author Felipe Matheus Ribeiro Lopes
 * @since 2023
 * @version 1.0
 *
 */
public class TelaBusca implements ActionListener, ListSelectionListener{
	
    private static JFrame jfrm = new JFrame("TelaBusca");
	private static JLabel jlab = new JLabel("Buscar");
	private static JTextField jtfBusca = new JTextField();
	
	private static JButton buscar = new JButton("Buscar produto");
	private static JButton excluir = new JButton("Exlcuir produto");
	
	private JList<String> list;
	private JScrollPane scroll;
	private String[] listaProds;
    private int pos;

	private static ControleDados dados = new ControleDados();
	
	public TelaBusca(ControleDados dados) {
		
		//Pega todos os produtos da filial.
        for(int i =  0; i < 5; i++){
        listaProds = new ControleEstoque(dados).getListaEstoque(dados,i);
		list = new JList<String>(listaProds);}

		jlab.setFont(new Font("Arial", Font.BOLD, 20));
		jlab.setBounds(100, 10, 175, 30);
		
        buscar.setBounds(175,10,150,30);
		excluir.setBounds(330, 10, 150, 30);

		jtfBusca.setBounds(175,50,305,30);
		
		
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION); 
	
		scroll = new JScrollPane(list); 
		scroll.setBounds(100,100,300,300);



		jtfBusca.addActionListener(this); 
		list.addListSelectionListener(this); 
	    buscar.addActionListener(this);
		excluir.addActionListener(this);
	

		jfrm.setSize(500, 500);
		jfrm.setLayout(null);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		jfrm.add(jlab);  
		jfrm.add(jtfBusca);
		jfrm.getContentPane().add(scroll);
        jfrm.add(buscar);
		jfrm.add(excluir);
	
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
		if(src == excluir){
			
		}			
	} 	
}

