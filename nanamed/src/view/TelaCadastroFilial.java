package view;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import controle.*;


public class TelaCadastroFilial implements ActionListener { 
	
	private JFrame jfrm = new JFrame("Cadastro");

	private JTextField tel = new JTextField();
	private JTextField endereco= new JTextField();
	private JTextField nome = new JTextField();

	private JButton salvar = new JButton("Salvar");

	private JLabel jlabPrompt = new JLabel("Digite o nome da filial: "); 
	private JLabel jlabPrompt1= new JLabel("Digite o endereco: ");
	private JLabel jlabPrompt2 = new JLabel("Digite o telefone: "); 

	private ControleDados dados;
	private int pos;

	public TelaCadastroFilial(ControleDados dados) { 
		this.dados = dados; 
		this.pos = pos;
		
		jlabPrompt.setBounds(10, 35, 208, 50);
		jlabPrompt.setFont(new Font("Arial", Font.BOLD, 15));
		nome.setBounds(200, 45, 280, 30);

		jlabPrompt1.setBounds(10, 75, 208, 50);
		jlabPrompt1.setFont(new Font("Arial", Font.BOLD, 15));
		endereco.setBounds(200, 85, 280, 30);

		jlabPrompt2.setBounds(10, 115, 208, 50);
		jlabPrompt2.setFont(new Font("Arial", Font.BOLD, 15));
		tel.setBounds(200, 125, 280, 30);

		salvar.setBounds(160, 210, 150, 40);
		jfrm.setLayout(null); 
		jfrm.setSize(500,300);
		
	
		jfrm.add(jlabPrompt); 
		jfrm.add(nome);  
		jfrm.add(jlabPrompt1);
		jfrm.add(endereco);
		jfrm.add(jlabPrompt2);
		jfrm.add(tel);
		jfrm.add(salvar);

		jfrm.setVisible(true);
		salvar.addActionListener(this); 



		}

	@Override
	public void actionPerformed(ActionEvent e) { 
		if (e.getSource() == salvar) {
			if (nome.getText().equals("") || endereco.getText().equals("")
					|| tel.getText().equals("")) {
				JOptionPane.showMessageDialog(salvar, "Todos os campos precisam ser preenchidos!");
			} else {
				
				String nomeF = nome.getText();
				String cidadeF = endereco.getText();
				String telefoneF = tel.getText();

				dados.cadastrarEditarFilial(nomeF, cidadeF, telefoneF, dados.getD().getEmpresa().getFiliais().size());
			
			
				JOptionPane.showMessageDialog(salvar, "Dados cadastrados com sucesso!");
				jfrm.dispose();
			}

		}	
	}
}
