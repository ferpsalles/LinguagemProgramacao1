package Viagem;

public class pessoaViagem {
    private String nome;
    private String cpf;
    private String destino;

    pessoaViagem(String nome, String cpf, String destino){
        this.nome= nome;
        this.cpf = cpf;
        this.destino = destino;
    }

    public String getNome(){
        return nome;
    }

    public void setNome (String nome){
        this.nome=nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf (String cpf){
        this.cpf=cpf;
    }
    public String getDestino(){
        return destino;
    }

    public void setDestino (String destino){
        this.destino=destino;
    }

    public String imprimir() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nDestino: " + destino;
    }
}
