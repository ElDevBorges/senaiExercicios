package model;

public class Pessoa {
    private  String nome;
    private String sexo;
    private int idade;

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getNome () {
        return nome;
    }

    public void setSexo (String sexo) {
        this.sexo = sexo;
    }

    public String getSexo () {
        return sexo;
    }

    public void setIdade (int idade) {
        this.idade = idade;
    }

    public int idade () {
        return idade;
    }

    public Pessoa (String nome,String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
}
