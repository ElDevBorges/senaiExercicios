import controller.Cadastrar;
import model.Professor;
import model.Aluno;
import controller.Cadastrar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {

        Aluno aluno = new Aluno();



        for (int i = 0; i < 2; i++) {
            aluno.criarAluno();
            if (i == 1) {
                for (i = 0; 1 <= 2; i++) {
                    aluno.mostrarAluno(i);
                }
            }


        }
        ;

    }
}