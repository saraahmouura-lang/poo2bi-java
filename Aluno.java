 public class Aluno extends pessoa {

    private String matricula;

    public Aluno(String nome, String fone, String cpf, String matricula) {
        super(nome, fone, cpf);
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }
    @Override
    public String saudacao() {
        return "Olá, sou o(a) aluno(a)"+getNome();
    }
    public String aprende(){
        return getNome()+" está aprendendo.";
    }
 }
