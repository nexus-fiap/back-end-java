package challenge.servico;

import java.util.ArrayList;

public class Orcamento {
    private ArrayList<String> diagnosticos;
    private double valorOrcamento = 0;


    public Orcamento(ArrayList<String> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public void gerarOrcamento () {
        for (String diagnostico : diagnosticos) {
            fazerComparacoes(diagnostico);
        }
    }

    public void fazerComparacoes(String comparacao) {

        if (comparacao.equals("Motor")) {
            valorOrcamento += 2000;
        }

        if (comparacao.equals("Retrovisor")) {
            valorOrcamento += 50;
        }

        if (comparacao.equals("Câmbio")) {
            valorOrcamento += 200;
        }

        if (comparacao.equals("Pneu")) {
            valorOrcamento += 400;
        }

        if (comparacao.equals("Radiador")) {
            valorOrcamento += 600;
        }

    }

    public double getValorOrcamento() {
        return valorOrcamento;
    }
}
