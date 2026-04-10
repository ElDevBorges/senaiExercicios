package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Aluno {
    private String nome;
    private String telefone;
    private String cpf;
    private Date data_nascimento;
    private int matricula;
    List<Aluno> listaAluno = new ArrayList<>();

    public Aluno (String nome, String telefone, String cpf, Date data_nascimento, int matricula) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.matricula = matricula;
    }

    public Aluno(){

    }

    @Override
    public String toString(){
     return "-----------------------\nnome: " + nome + "\ntelefone: " + telefone + "\ncpf = " + cpf + "\ndata de nascimento = " + data_nascimento + "\nmatricula = " + matricula + "\n";
    }

    public void mostrarAluno (int aluno) {
        System.out.println(listaAluno.get(aluno));
    }

    public void criarAluno() throws ParseException {
        String aluno_nome;
        String aluno_telefone;
        String aluno_cpf;
        String aluno_data_nascimento;
        int aluno_matricula;
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");



        System.out.print("Digite o nome do aluno: ");
        aluno_nome = sc.nextLine();

        System.out.print("Digite o telefone: ");
        aluno_telefone = sc.nextLine();

        System.out.print("Digite o cpf: ");
        aluno_cpf = sc.nextLine();

        System.out.print ("Digite a data de nascimento: ");
        aluno_data_nascimento = sc.next();
        Date aluno_data_nascimento_formatado = sdf.parse(aluno_data_nascimento);

        System.out.print ("Digite o numero de matricula: ");
        aluno_matricula = sc.nextInt();

        Aluno aluno = new Aluno (aluno_nome, aluno_telefone, aluno_cpf, aluno_data_nascimento_formatado, aluno_matricula);

        listaAluno.add(aluno);


    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
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
