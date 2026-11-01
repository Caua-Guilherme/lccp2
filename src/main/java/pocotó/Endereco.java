package pocotó;

public class Endereco {
    private String numero;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String numero,String logradouro,String bairro,String cidade,String estado){
        this.numero = numero;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }
    public Endereco(){
        this("","","","","");
    }
    public String getNumero(){
        return numero;
    }
    public String getLogradouro(){
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

