package application;

public class carro {
    // Atributos
    private String marca;
    private String modelo;
    private String ano;
    private String preco;

    public carro(String marca, String modelo, String ano, String preco) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    //Metodo de acesso - Getters - Setters
    public String getMarca() {

        return marca;
    }

    public void setMarca(String marca) {


        this.marca = marca;
    }

    public String getModelo() {

        return modelo;
    }

    public void setModelo(String modelo) {

        this.modelo = modelo;
    }

    public String getAno() {

        return ano;
    }

    public void setAno(String ano) {

        this.ano = ano;
    }

    public String getPreco() {

        return preco;
    }

    public void setPreco(String preco) {

        this.preco = preco;
    }

    //Metodos da classe
    public String imprimir() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano + "\nPreço: " + preco;
    }
}