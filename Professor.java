public public class Professor extends Aluno {
    private String titulo;
    public Professor(String nome, String fone, String cpf, String matricula, String titulo) {
        super(nome, fone, cpf, matricula);
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }

    @Override
    public String saudacao() {
        return "Olá, sou o(a) professor(a) "+getNome()+" e meu título é "+titulo;
    }

    public String ensina(){
        return getNome()+" está ensinando.";
    }

}
