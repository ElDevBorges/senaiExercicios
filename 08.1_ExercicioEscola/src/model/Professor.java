package model;

import java.util.Date;

public class Professor {
    private String nome;
    private int telefone;
    private String registro_funcional;
    private Date data_nascimento;

    public Professor (String nome, int telefone, String registro_funcional, Date data_nascimento){
        this.nome = nome;
        this.telefone = telefone;
        this.registro_funcional = registro_funcional;
        this.data_nascimento = data_nascimento;
    }
    public Professor() {

    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public int getTelefone () {
        return telefone;
    }

    public void setTelefone (int telefone) {
        this.telefone = telefone;
    }

    public String getRegistro_funcional () {
        return registro_funcional;
    }

    public void setRegistro_funcional () {
        this.registro_funcional = registro_funcional;
    }

    public Date getData_nascimento () {
        return data_nascimento;
    }

    public void setData_nascimento (Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

}
