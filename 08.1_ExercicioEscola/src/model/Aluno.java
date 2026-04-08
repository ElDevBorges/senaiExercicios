package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import controller.Cadastrar;

public class Aluno {
    private String nome;
    private int telefone;
    private String cpf;
    private Date data_nascimento;
    private int matricula;

    public Aluno (String nome, int telefone, String cpf, Date data_nascimento, int matricula) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.matricula = matricula;

    }
    public void mostrarAluno () {
        System.out.println("Nome: " + nome);
        System.out.println("telefone: " + telefone);
        System.out.println("Cpf: " + cpf);
        System.out.println("Data de nascimento: " + data_nascimento);
        System.out.println("Matricula: " + matricula);
    }

    public void criarAluno() throws ParseException {
        String aluno_nome;
        int aluno_telefone;
        String aluno_cpf;
        String aluno_data_nascimento;
        int aluno_matricula;
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.print("Digite o nome do aluno: ");
        aluno_nome = sc.nextLine();

        System.out.print("Digite o telefone: ");
        aluno_telefone = sc.nextInt();

        System.out.print("Digite o cpf ");
        aluno_cpf = sc.nextLine();

        System.out.print ("Digite a data de nascimento");
        aluno_data_nascimento = sc.nextLine();
        Date aluno_data_nascimento_formatado = sdf.parse(aluno_data_nascimento);

        System.out.print ("Digite o numero de matricula");
        aluno_matricula = sc.nextInt();


    }

    public Aluno(){

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
