public class AlunoFatecSJC {
    private String nome;
    private String sobrenome;
    private int matricula;
    private double mediaFinal;

    public AlunoFatecSJC(String nome, String sobrenome, int matricula, double mediaFinal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
        this.mediaFinal= mediaFinal;
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
    public void setMatricula(int matricula){

        this.matricula = matricula;
    }
    public int getMatricula(){

        return matricula;
    }
    public void setMediaFinal(int mediaFinal){

        this.mediaFinal = mediaFinal;
    }
    public double getMediaFinal() {

        return mediaFinal;
    }
}

