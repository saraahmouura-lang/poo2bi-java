import javax.swing.JOptionPane;

class Pessoa {

    private String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Aluno extends Pessoa {

    Aluno(String nome) {
        super(nome);
    }

    void estudar() {

        JOptionPane.showMessageDialog(
            null,
            getNome() + " está estudando."
        );

    }
}

public class Main {

    public static void main(String[] args) {

        Aluno a = new Aluno("João");

        a.estudar();

    }
}
