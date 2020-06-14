package entities;

public class pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String conta;


    public pessoa(String nome, String sobrenome, String cpf, String conta) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.conta = conta;
    }

    public String getNome(){
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getConta(){
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String listarDadosPessoa(String cpf){
        return ("CPF: " + cpf);
    }

    public String imprimir() {
        return "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nCPF: " + cpf + "\nConta: " + conta;
    }

}
