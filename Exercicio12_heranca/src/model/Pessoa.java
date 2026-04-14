package model;

public class Pessoa {
    private String nome;
    private String rg;
    private String cpf;
    private String telefone;
    private String email;

    public Pessoa (String nome, String rg, String cpf, String telefone, String email) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;

    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg () {
        return rg;
    }

    public void setRg (String rg) {
        this.rg = rg;
    }
}
