public class pessoa {

    private String nome;
    private String fone;
    private String cpf;

    public pessoa(String nome, String fone, String cpf) {
        this.nome = nome;
        this.fone = fone;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public String getFone() {
        return fone;
    }
    public String getCpf() {
        return cpf;
    }
    public String saudacao(){
        return "Olá, meu nome é" +nome;
    }
    public String saudacao(Aluno aluno){
        return "Olá, meu nome é" +nome;
    }
    public String saudacao(Professor professor){
        return "Olá, meu nome é" +nome;
    }
    
}
