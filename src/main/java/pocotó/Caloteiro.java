package pocotó;


public class Caloteiro {

    private String nome;
    private Endereco endereco;
    private Boolean caloteiro;
    private Float devendo;

    public Caloteiro(String nome, Endereco endereco, Boolean caloteiro, Float devendo){
        this.nome = nome;
        this.endereco = endereco;
        this.caloteiro = caloteiro;
        this.devendo = devendo;

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Boolean getCaloteiro() {
        return caloteiro;
    }

    public void setCaloteiro(Boolean caloteiro) {
        this.caloteiro = caloteiro;
    }

    public Float getDevendo() {
        return devendo;
    }

    public void setDevendo(Float devendo) {
        this.devendo = devendo;
    }


}
