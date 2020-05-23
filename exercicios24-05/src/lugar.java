public class lugar {
    private String nome;
    private String localizacao;
    private int telefone;
    private int horarioAbertura;
    private int horarioFechamento;


    public lugar(String nome, String localizacao, int telefone, int horarioFechamento, int horarioAbertura) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.telefone = telefone;
        this.horarioFechamento = horarioFechamento;
        this.horarioAbertura = horarioAbertura;
    }

    public void setNome(String nome){

        this.nome = nome;
    }
    public String getNome() {

        return nome;
    }

    public void setLocalizacao(String localizacao){

        this.localizacao = localizacao;
    }
    public String getLocalizacao() {

        return localizacao;
    }
    public void setTelefone(int telefone){

        this.telefone = telefone;
    }
    public double getTelefone(){

        return telefone;
    }
    public void setHorarioAbertura(int horarioAbertura){

        this.horarioAbertura = horarioAbertura;
    }
    public int getHorarioAbertura() {

        return horarioAbertura;
    }
    public void setHorarioFechamento(int horarioFechamento){

        this.horarioFechamento = horarioFechamento;
    }
    public int getHorarioFechamento() {

        return horarioFechamento;
    }
}
