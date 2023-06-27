package modelo;

import java.util.*;
import controle.ControleFilial;

public class Dados {
		private static ControleFilial controleFilial = new ControleFilial();
		private static Empresa empresa = new Empresa();
		private static Filial filial = new Filial();
		private ArrayList<Filial> filiais = new ArrayList<Filial>();
		private ArrayList<Medicamento> medicamento = new ArrayList<Medicamento>();
		private ArrayList<Cosmetico> cosmetico = new ArrayList<Cosmetico>();
		int qtdFiliais = 0;
		
		 public void fillWithSomeData() {
		        for (int i = 0; i < 5; i++) {
		        	Filial fil = new Filial("Filial"+i,"cidade"+i,""+(i+1)*1000000);
		        		filiais.add(fil);
		        	Medicamento med = new Medicamento("medicamento"+i,(i+1)*420,(i+2)*2.99,"10/10/202"+(i+2),"12321312"+(i*2)*10,(i*50)+"mg","tipo"+i);
		        		medicamento.add(med);
		        	Cosmetico cos = new Cosmetico("medicamento"+i,(i+1)*420,(i+2)*2.99,"23/03/202"+(i+2),"12321312"+(i*2)*10,(i*50)+"mL","marca"+i);
		        		cosmetico.add(cos);
		        }
		        	/*
		            Telefone tel = new Telefone((i+1)*100, (i+1)*1000000);
		            filiais[i] = new Filial((i+1)*12345678912345L, "Filial "+(i+1), tel, i+2, i+2);
		            
		            for (int j = 0; j < i+2; j++) {
		            	
		                VagaExperiente Vexp = new VagaExperiente(""+(j+1), (j+1)*10, j+1, (j+1)*1000, j*3, "A ser definido");
		                VagaInexperiente Vinxp = new VagaInexperiente(""+(j+2), (j+2)*10, j+2, (j+2)*1000, false, true);
		                
		                empresas[i].setVagaExp(Vexp, j);
		                empresas[i].setVagaInxp(Vinxp, j);
		                
		            }
		            
		            qtdEmpresas++;
		            
		        }
		        */
		      }
		 	
			public void cadastroFilial(Filial f) {
				filiais.add(f);
			}
			public void cadastroMedicamento(Medicamento m) {
				medicamento.add(m);
			}
			public void cadastroCosmetico(Cosmetico c) {
				cosmetico.add(c);
			}
			
			
		/*
		public Dados() {
			controleFilial.ctrlCadastrarFilial("nomeFilial", "cidadeFilial", "telefoneFilial");
			controleFilial.ctrlCadastrarFilial("nomeFilial2", "cidadeFilial2", "telefoneFilial2");
			controleFilial.ctrlCadastrarFilial("nomeFilial3", "cidadeFilial3", "telefoneFilial3");
			
			empresa.setNomeEmpresa("Nome da empresa");
			empresa.setFiliais(controleFilial.getEmpresa().getFiliais());
		}
		*/
		public Empresa getEmpresa() {
			return empresa;
		}

		public Filial getFilial() {
			return filial;
		}

		
		
		
}
