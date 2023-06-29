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
		        for (int i = 0; i <= 5; i++) {
		        	Filial fil = new Filial("Filial"+i,"cidade"+i,""+(i+1)*1000000);
					fillCosmeticAndMeds(fil);
		        	empresa.setFiliais(fil);
		        }
		}

		public void fillCosmeticAndMeds(Filial fil) {
			for (int j = 0; j <= 5; j++){
				Medicamento med = new Medicamento("med"+j,(j+1)*420,(j+2)*1.99,"10/10/202"+(j+2),"101101"+(j*2)*10,(j*50)+"mg","tipo"+j);
				Cosmetico cos = new Cosmetico("cos"+j,(j+1)*420,(j+2)*1.99,"23/03/202"+(j+2),"10010"+(j*2)*10,(j*50)+"mL","marca"+j);

				fil.getCosmetico().add(cos);
				fil.getMedicamento().add(med);
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
