package model;

public class Professor extends Usuario implements IUsuario {
    private int matriculaProfessor;
    private String nome;
    private String especialidade;

    public Professor(String login, String senha, String tipo, int matriculaProfessor, String nome, String especialidade) {
        super(login, senha, tipo);
        this.matriculaProfessor = matriculaProfessor;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public int getMatriculaProfessor() {
        return matriculaProfessor;
    }

    public void setMatriculaProfessor(int matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void mostrar() {

    }

    @Override
    public boolean validarLogin(String login, String senha) {
        if (getLogin().equals(login) && getSenha().equals(senha)) {
            return true;
        }
        return false;
    }
}
