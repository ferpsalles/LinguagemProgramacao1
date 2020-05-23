public class InstrumentoMusical {
    private String instrumento;
    private String marca;
    private double preco;
    private double desconto;

    public InstrumentoMusical(String instrumento, String marca, double preco, double desconto) {
        this.instrumento = instrumento;
        this.marca = marca;
        this.preco = preco;
        this.desconto= desconto;
    }
    public void setInstrumento(String instrumento){

        this.instrumento = instrumento;
    }
    public String getInstrumento() {

        return instrumento;
    }
    public void setMarca(String marca){

        this.marca = marca;
    }
    public String getMarca() {

        return marca;
    }
    public void setPreco(double preco){

        this.preco = preco;
    }
    public double getPreco() {

        return preco;
    }
    public void setDesconto(double desconto){

        this.desconto = desconto;
    }
    public double getDesconto() {

        return desconto;
    }
}
