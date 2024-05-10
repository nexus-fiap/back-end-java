package challenge.dominio;

import java.util.ArrayList;

public class DescricaoProblema {
    private String descricao;
    private ArrayList<Peca> pecasDanificadas;

    public DescricaoProblema(String descricao, ArrayList<Peca> pecasDanificadas) {
        this.descricao = descricao;
        this.pecasDanificadas = pecasDanificadas;
    }
}
