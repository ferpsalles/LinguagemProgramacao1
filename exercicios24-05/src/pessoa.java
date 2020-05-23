public class pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private String profissao;

        public pessoa(String nome, String sobrenome, int idade, String profissao){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public void setNome(String nome){

        this.nome = nome;
    }
    public String getNome() {

        return nome;
    }

    public void setSobrenome(String sobrenome){

        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {

        return sobrenome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public double getIdade(){

        return idade;
    }
    public void setProfissao(String profissao){

        this.profissao = profissao;
    }
    public String getProfissao() {

        return profissao;
    }

}


