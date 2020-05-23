public class Calcado {
    private String calcado;
    private String marca;
    private int preco;
    private int tamanho;

    public Calcado (String calcado, String marca, int preco, int tamanho){
        this.calcado = calcado;
        this.marca= marca;
        this.preco= preco;
        this.tamanho = tamanho;
    }
    public void setCalcado(String calcado){

        this.calcado= calcado;
    }
    public String getCalcado() {

        return calcado;
    }
    public void setMarca(String marca){

        this.marca = marca;
    }
    public String getMarca() {

        return marca;
    }
    public void setPreco(int preco){

        this.preco = preco;
    }
    public int getPreco() {

        return preco;
    }
    public void setTamanho(int tamanho){

        this.tamanho = tamanho;
    }
    public int getTamanho() {

        return tamanho;
    }
}
