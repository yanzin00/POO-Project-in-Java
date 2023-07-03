package nanamed.testes;

import controle.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

class Testes {
  @Test  
  void testCadastrarEditarFilial() {
		ControleDados d = new ControleDados();
		String nomeFilial = "Filial1";
		String telefoneErrado = "123456789!";
		String telefoneCorreto = "1234567891234567";
		String enderecoFilial = "Endereco1";
		int index = 1;

		assertTrue(d.cadastrarEditarFilial(nomeFilial, enderecoFilial, telefoneCorreto, index));
		assertFalse(d.cadastrarEditarFilial(nomeFilial, enderecoFilial, telefoneErrado , index));

	}
    @Test
    void testCadastrarEditarMedicamento() {
		ControleDados d = new ControleDados();
		String nome = "nome1";
        int quantidade = 2;
        String codigoDeBarra = "10110110";
        String tipo = "homepatico ";
        String validade = "12/02/2002 ";
        Double preco = 20.0;


		String dosagemCerta = "20";
		String dosagemErrada = "vinte";

		assertTrue(d.editarCadastrarMedicamento(nome,quantidade,preco,validade,codigoDeBarra,dosagemCerta,tipo));
		assertFalse(d.editarCadastrarMedicamento(nome,quantidade,preco,validade,codigoDeBarra,dosagemErrada,tipo));

	}
    @Test
    void testCadastrarEditarCosmetico() {
		ControleDados d = new ControleDados();
		String nome = "nome1";
        int quantidade = 2;
        String codigoDeBarra = "10110110";
        String marca = "marca 1 ";
        String validade = "12/02/2002 ";
        Double preco = 20.0;

		String volumeCerto= "20";
		String volumeErrado = "vinte";

		assertTrue(d.editarCadastrarCosmetico(nome,quantidade,preco,validade,codigoDeBarra,marca,volumeCerto));
		assertFalse(d.editarCadastrarCosmetico(nome,quantidade,preco,validade,codigoDeBarra,marca,volumeErrado));

	}
}