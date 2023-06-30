package view;

import javax.swing.*;
import java.awt.event.*;
import controle.*;

public class TelaEditar implements ActionListener {
    private JFrame jfrm = new JFrame("add");

    private JLabel jlNome = new JLabel("nome:");
    private JLabel jlqtd = new JLabel("quantidade:");
    private JLabel jlpreco = new JLabel("preco:");
    private JLabel jlval = new JLabel("validade:");
    private JLabel jlcdb = new JLabel("Codigo de Barra:");
    private JLabel jlvol = new JLabel("volume:");
    private JLabel jlmarca = new JLabel("marca");
    
    
    private JLabel jlTipo = new JLabel("Tipo");
    private JLabel jlDose= new JLabel("Dosagem");


    private JTextField jtfNome = new JTextField();
    private JTextField jtfQtd = new JTextField();
    private JTextField jtfPreco = new JTextField();
    private JTextField jtfVal = new JTextField();
    private JTextField jtfCdb = new JTextField();
    private JTextField jtfVol = new JTextField();
    private JTextField jtfMarca = new JTextField();
    
    private JTextField jtfTipo = new JTextField();
    private JTextField jtfDose = new JTextField();

    private JButton salvarMed = new JButton("salvar");
    private JButton salvarCos = new JButton("salvar");
    private int pos;
    
    private ControleDados dados;

    public TelaEditar(ControleDados dados, int op, int pos){
        this.dados = dados;
        this.pos = pos;

        switch(op){
            case 1:
        jfrm.setSize(400,300);
        jfrm.setLayout(null);

        jlNome.setBounds(10,0,150,30);
        jlqtd.setBounds(10,30,150,30);
        jlpreco.setBounds(10,60,150,30);
        jlval.setBounds(10,90,150,30);
        jlcdb.setBounds(10,120,150,30);
        jlDose.setBounds(10,150,150,30);
        jlTipo.setBounds(10,180,150,30);

        salvarMed.setBounds(260, 210, 100, 50);

        jtfNome.setBounds(120, 0, 200, 30);
        jtfQtd.setBounds(120, 30, 200, 30);
        jtfPreco.setBounds(120, 60, 200, 30);
        jtfVal.setBounds(120, 90, 200, 30);
        jtfCdb.setBounds(120, 120, 200, 30);
        jtfDose.setBounds(120, 150, 200, 30);
        jtfTipo.setBounds(120, 180, 200, 30);

        salvarMed.addActionListener(this);

        jfrm.add(jlNome);
        jfrm.add(jlqtd);
        jfrm.add(jlpreco);
        jfrm.add(jlval);
        jfrm.add(jlcdb);
        jfrm.add(jlDose);
        jfrm.add(jlTipo);
        

        jfrm.add(jtfNome);
        jfrm.add(jtfQtd);
        jfrm.add(jtfPreco);
        jfrm.add(jtfVal);
        jfrm.add(jtfCdb);
        jfrm.add(jtfDose);
        jfrm.add(jtfTipo);
        
        jfrm.add(salvarMed);

        jfrm.setVisible(true);
        break;

        case 2:
        jfrm.setSize(400,300);
        jfrm.setLayout(null);

        jlNome.setBounds(10,0,150,30);
        jlqtd.setBounds(10,30,150,30);
        jlpreco.setBounds(10,60,150,30);
        jlval.setBounds(10,90,150,30);
        jlcdb.setBounds(10,120,150,30);
        jlvol.setBounds(10,150,150,30);
        jlmarca.setBounds(10,180,150,30);

        salvarCos.setBounds(260, 210, 100, 50);

        jtfNome.setBounds(120, 0, 200, 30);
        jtfQtd.setBounds(120, 30, 200, 30);
        jtfPreco.setBounds(120, 60, 200, 30);
        jtfVal.setBounds(120, 90, 200, 30);
        jtfCdb.setBounds(120, 120, 200, 30);
        jtfVol.setBounds(120, 150, 200, 30);
        jtfMarca.setBounds(120, 180, 200, 30);

        salvarCos.addActionListener(this);

        jfrm.add(jlNome);
        jfrm.add(jlqtd);
        jfrm.add(jlpreco);
        jfrm.add(jlval);
        jfrm.add(jlcdb);        
        jfrm.add(jlvol);
        jfrm.add(jlmarca);

        jfrm.add(jtfNome);
        jfrm.add(jtfQtd);
        jfrm.add(jtfPreco);
        jfrm.add(jtfVal);
        jfrm.add(jtfCdb);
        jfrm.add(jtfVol);
        jfrm.add(jtfMarca);

        jfrm.add(salvarCos);
        jfrm.setVisible(true);
            
        }


    
  }
  @Override
    public void actionPerformed(ActionEvent e) {
        
		Object src = e.getSource();	
		
		if(src == salvarMed) {
            if (jtfNome.getText().equals("") || jtfQtd.getText().equals("")
					|| jtfPreco.getText().equals("")|| jtfVal.getText().equals("")
                    || jtfCdb.getText().equals("")|| jtfDose.getText().equals("")
                    || jtfTipo.getText().equals("")) {
				JOptionPane.showMessageDialog(salvarMed, "Todos os campos precisam ser preenchidos!");
			} 
			else{	
				String nome = jtfNome.getText();
                int quantidade = Integer.parseInt(jtfQtd.getText());
				Double preco = Double.parseDouble(jtfPreco.getText());
                String validade = jtfVal.getText();
				String codigo = jtfCdb.getText();
				String tipo = jtfTipo.getText();
				String dosagem = jtfDose.getText();
			

				dados.cadastrarEditarMedicamento(nome, quantidade, preco, validade,codigo,dosagem,tipo, dados.getD().getEmpresa().getFiliais().size(),pos);
			
			
				JOptionPane.showMessageDialog(salvarMed, "Dados cadastrados com sucesso!");
				jfrm.dispose();
            }
			}
            
        else if(src == salvarCos) {
            
			if (jtfNome.getText().equals("") || jtfQtd.getText().equals("")
					|| jtfPreco.getText().equals("")|| jtfVal.getText().equals("")
                    || jtfCdb.getText().equals("")|| jtfVol.getText().equals("")
                    || jtfMarca.getText().equals("")) {
				JOptionPane.showMessageDialog(salvarMed, "Todos os campos precisam ser preenchidos!");
			} 
            else {
				
				
				String nome = jtfNome.getText();
                int quantidade = Integer.parseInt(jtfQtd.getText());
				Double preco = Double.parseDouble(jtfPreco.getText());
                String validade = jtfVal.getText();
				String codigo = jtfCdb.getText();
				String volume = jtfVol.getText();
				String marca = jtfMarca.getText();
				
                dados.cadastrarEditarCosmetico(nome,quantidade,preco,validade,codigo,volume,marca, dados.getD().getEmpresa().getFiliais().size());

				
			
				JOptionPane.showMessageDialog(salvarCos, "Dados cadastrados com sucesso!");
				jfrm.dispose();
			}
        }
        
	}
    
       
}
