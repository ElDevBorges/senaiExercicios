package model;

public class Professor extends Pessoa {
    private String matricula;
    private String segmento;

    public Professor (String nome, String rg, String cpf, String telefone, String email, String matricula, String segmento) {
        super(nome, rg, cpf, telefone,email);
        this.matricula = matricula;
        this.segmento = segmento;

    }
}
