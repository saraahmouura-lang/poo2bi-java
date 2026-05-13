class Pessoa {

    private String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    void falar() {
        System.out.println("Oi, eu sou " + nome);
    }
}

class Aluno extends Pessoa {

    Aluno(String nome) {
        super(nome);
    }

    void estudar() {
        System.out.println(getNome() + " está estudando.");
    }
}

class Professor extends Aluno {

    Professor(String nome) {
        super(nome);
    }

    void ensinar() {
        System.out.println(getNome() + " está ensinando.");
    }
}

class Funcionario extends Pessoa {

    Funcionario(String nome) {
        super(nome);
    }

    void trabalhar() {
        System.out.println(getNome() + " está trabalhando.");
    }
}

class Responsavel extends Pessoa {

    private Aluno aluno;

    Responsavel(String nome, Aluno aluno) {
        super(nome);
        this.aluno = aluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    void mostrarAluno() {
        System.out.println(
            getNome() + " é responsável por " +
            aluno.getNome()
        );
    }
}

public class Main {

    public static void main(String[] args) {

        Aluno a = new Aluno("João");

        a.falar();
        a.estudar();

        Professor p = new Professor("Maria");

        p.falar();
        p.ensinar();

        Funcionario f = new Funcionario("Carlos");

        f.falar();
        f.trabalhar();

        Responsavel r = new Responsavel("Ana", a);

        r.falar();
        r.mostrarAluno();

        a.setNome("Pedro");

        System.out.println("Novo nome do aluno: " + a.getNome());
    }
}
