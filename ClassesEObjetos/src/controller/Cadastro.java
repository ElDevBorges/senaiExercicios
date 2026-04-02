package controller;
import model.Carro;
import model.Livro;
import model.Produto;
import model.Funcionario;


public class Cadastro {
	public static void main (String[] args) {
		
		Funcionario funcionario1 = new Funcionario(111, "luiz felipe", "1742112176");
		
		System.out.println(funcionario1.getNome());
		funcionario1.setNome("borges");
		System.out.println(funcionario1.getNome());
		
		
		
		
		
		Funcionario funcionario2 = new Funcionario(222, "rafael", "1722712186");
		Funcionario funcionario3 = new Funcionario(333, "luiz", "3742512166");
		
		Livro livro1 = new Livro(0, "massacre", "Agatha Christe", "alguma");
		Livro livro2 = new Livro(0, "mansão hollow", "Agatha Christe", "alguma");
		Livro livro3 = new Livro(0, "crimes ABC", "Agatha Christe", "alguma");
		
		
		Carro carro1 = new Carro("Fiat", "uno", "branco", "1980");

		
		

	}

}
