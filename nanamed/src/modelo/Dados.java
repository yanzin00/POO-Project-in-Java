package modelo;

import java.util.*;

public class Dados {
		private Empresa empresa = new Empresa();
		private Filial filial = new Filial();
		private ArrayList<Filial> filiais = new ArrayList<Filial>();
		private ArrayList<Medicamento> medicamento = new ArrayList<Medicamento>();
		private ArrayList<Cosmetico> cosmetico = new ArrayList<Cosmetico>();
		int qtdFiliais = 0;
		
		 public void fillWithSomeData() {
		        for (int i = 0; i < 5; i++) {
		        	Filial fil = new Filial("Filial"+i,"cidade"+i,""+(i+1)*1000000);
		        		
		        	Medicamento med = new Medicamento("medicamento"+i*2,(i+1)*420,(i+2)*2.99,"10/10/202"+(i+2),"12321312"+(i*2)*10,(i*50)+"mg","tipo"+i);
		        		
		        	Cosmetico cos = new Cosmetico("medicamento"+i*2,(i+1)*420,(i+2)*2.99,"23/03/202"+(i+2),"12321312"+(i*2)*10,(i*50)+"mL","marca"+i);
		        	fil.getCosmetico().add(cos);
		        	fil.getMedicamento().add(med);
		        	
		        	empresa.setFiliais(fil);
		        }
		      
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
		public Empresa getEmpresa() {
			return empresa;
		}

		public Filial getFilial() {
			return filial;
		}
}
