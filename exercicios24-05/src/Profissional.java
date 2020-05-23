public class Profissional {
    private String nome;
    private String sobrenome;
    private String cargo;
    private double salario;
    private double imposto;

    /*public double pagamentoImposto (double salario) {
        if (this.salario < 5000.00) {
            double salarioFinal = salario * 0.9;
            return salarioFinal;
        } else {
            double salarioFinal = salario*0.8;
            return  salarioFinal;
        }
     */
    public Profissional (String nome, String sobrenome,String cargo, double salario, double imposto) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cargo= cargo;
        this.imposto= imposto;
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
    public void setCargo(String cargo){

        this.cargo = cargo;
    }
    public String getCargo() {

        return cargo;
    }
    public void setSalario(double salario){

        this.salario = salario;
    }
    public double getSalario() {

        return salario;
    }
    public void setImposto(double imposto){

        this.imposto = imposto;
    }
    public double getImposto() {

        return imposto;
    }
}

