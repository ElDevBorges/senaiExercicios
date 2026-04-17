package model;

public class Aluno extends Usuario implements IUsuario {
    private int matricula;
    private String nome;
    private String turno;
    private String turma;

    public Aluno(String login, String senha, String tipo, int matricula, String nome, String turno, String turma) {
        super(login, senha, tipo);
        this.matricula = matricula;
        this.nome = nome;
        this.turno = turno;
        this.turma = turma;
    }

    @Override
    public void mostrar() {
        System.out.println("Informaçoes do aluno");
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Nome: " + getNome());
        System.out.println("Turma: " + getTurma());
        System.out.println("Turno: " + getTurno());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public boolean validarLogin(String login, String senha) {
        if (getLogin().equals(login) && getSenha().equals(senha)) {
            return true;
        }
        return false;
    }
}
