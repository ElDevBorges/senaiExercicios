package controller;
import model.Carro;
import model.Funcionario;


public class Cadastro {
	public static void main (String[] args) {
		Carro carro1 = new Carro();
		carro1.fabricante = "Fiat";
		carro1.modelo = "Palio";
		carro1.cor = "Prata";
		carro1.ano = "2022";
		
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		Funcionario funcionario3 = new Funcionario();
		
		funcionario1.criarFuncionario(111, "luiz felipe", "1742112176");
		funcionario2.criarFuncionario(222, "luiz felipe", "1742112176");
		funcionario3.criarFuncionario(222, "luiz felipe", "1742112176");

		
		
		Carro carro2 = new Carro();
		carro2.montarCarro("Fiat", "uno", "branco", "1980");
		
		
	System.out.println(carro2.modelo);
	}

}
