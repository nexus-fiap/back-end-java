package challenge.dominio;

public class Veiculo {
    private String placa;
    private String modelo;
    private String marca;
    private int ano;
    private String descricaoProblema;

    public Veiculo(String placa, String modelo, String marca, int ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public void fazerDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public String getPlaca() {
        return placa;
    }

    public String descreverCarro () {
        return "Placa: " + placa + ", Modelo:" + modelo + ", Marca:" + marca + ", Ano:" + ano;
    }
}
