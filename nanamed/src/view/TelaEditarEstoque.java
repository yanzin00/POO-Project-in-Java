package view;

import java.awt.event.*;
import javax.swing.*;
import controle.*;

public class TelaEditarEstoque implements ActionListener{
    private JFrame jfrm  = new JFrame("editar");

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

    private JButton salvarMed = new JButton("Salvar");
    private JButton salvarCos = new JButton("Salvar");
    private JButton excluir = new JButton("Excluir do estoque");
    private int pos;
    
    private ControleDados dados;

    public TelaEditarEstoque(ControleDados dados, int op, int pos){
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
        excluir.setBounds(200, 210, 100, 50);

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
        jfrm.add(excluir);

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
         excluir.setBounds(200, 210, 100, 50);

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
        jfrm.add(excluir);

        jfrm.setVisible(true);
            
        }


   
}

    @Override
    public void actionPerformed(ActionEvent e) {
      
    }

}
