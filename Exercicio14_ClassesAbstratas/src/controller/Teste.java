package controller;

import model.Aluno;
import model.Professor;
import model.Usuario;

public class Teste {
    public static void main (String [] args) {
        //Usuario usuario1 = new Usuario("felipe", "asdf1", "tipo1");

        Professor professor1 = new Professor ("professor1","asdf123", "usuario", 155, "Borges", "T.I");

        Aluno aluno1 = new Aluno ("aluno1", "asdf22", "usuario", 999, "felipe", "tarde","903");

        aluno1.mostrar();
    }
}
