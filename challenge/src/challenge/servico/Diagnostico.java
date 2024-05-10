package challenge.servico;

import challenge.dominio.Veiculo;

import java.util.ArrayList;

public class Diagnostico {

    private String[] diagnosticos;
    private ArrayList<String> diagnosticosEncontrados;

    public Diagnostico(String[] diagnosticos) {
        this.diagnosticos = diagnosticos;
        this.diagnosticosEncontrados = new ArrayList<>();
    }

    public ArrayList<String> fazerDiagnostico (Veiculo veiculo) {
        String descricao = veiculo.getDescricaoProblema();
        String[] palavrasDescricao = descricao.split("\\W+");
        for(String palavra : palavrasDescricao) {
            for (String diagnostico : diagnosticos) {
                if (palavra.equals(diagnostico)) {
                    diagnosticosEncontrados.add(palavra);
                }
            }
        }
        return diagnosticosEncontrados;
    }

}
