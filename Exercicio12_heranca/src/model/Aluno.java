package model;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String nome, String cpf, String rg, String telefone, String email, String matricula, String curso) {
        super(nome, rg, cpf, telefone, email);
        this.matricula = matricula;
        this.curso = curso;
    }
}
