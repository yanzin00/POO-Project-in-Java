package modelo;

import java.util.*;
import controle.ControleFilial;
public class Dados {
		private static ControleFilial controleFilial = new ControleFilial();
		private static Empresa empresa = new Empresa();
	
		public Dados() {
			controleFilial.ctrlCadastrarFilial("nomeFilial", "cidadeFilial", "telefoneFilial");
			controleFilial.ctrlCadastrarFilial("nomeFilial2", "cidadeFilial2", "telefoneFilial2");
			controleFilial.ctrlCadastrarFilial("nomeFilial3", "cidadeFilial3", "telefoneFilial3");
			
			empresa.setNomeEmpresa("Nome da empresa");
			empresa.setFiliais(controleFilial.getEmpresa().getFiliais());
		}
		
		public Empresa getEmpresa() {
			return empresa;
		}	
}