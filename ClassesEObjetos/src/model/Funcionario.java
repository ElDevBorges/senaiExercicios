package model;

public class Funcionario {
	private int matricula;
	private String nome;
	private String cpf;
	
	public Funcionario (int matricula, String nome, String cpf) {
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome () {
		String nome = this.nome;
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}


	

}
