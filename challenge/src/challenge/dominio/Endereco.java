package challenge.dominio;

public class Endereco {
    private String rua;
    private int numero;
    private String cep;

    public Endereco(String rua, int numero, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }
}
