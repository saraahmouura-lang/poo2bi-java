import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Aluno(
            "Sarah",
            "123456789",
            "123456789",
            "2023001"
        );

        Pessoa p2 = new Professor(
            "João",
            "987654321",
            "987654321",
            "2023002",
            "Doutor"
        );

        Pessoa p3 = new Funcionario(
            "Maria",
            "555555555",
            "555555555",
            "F001",
            "Secretária"
        );

        Pessoa[] pessoas = {p1, p2, p3};

        String resultado = "";

        for (Pessoa p : pessoas) {
            resultado += p.saudacao() + "\n";
        }

        JOptionPane.showMessageDialog(
            null,
            resultado,
            "Sistema Escolar",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
