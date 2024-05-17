package challenge.servico;

import challenge.dominio.Mecanica;

import java.util.ArrayList;
import java.util.Scanner;

public class Agendamento {
    private Orcamento orcamento;
    private ArrayList<Mecanica> mecanicas;
    private Scanner leitor;

    public Agendamento(Orcamento orcamento, ArrayList<Mecanica> mecanicas, Scanner leitor) {
        this.orcamento = orcamento;
        this.mecanicas = mecanicas;
        this.leitor = leitor;
    }

    public void agendarHorario() {
        System.out.println("\n");
        for (int i = 0; i < mecanicas.size(); i++) {
            System.out.println(i + " " + mecanicas.get(i).getNome());
        }
        System.out.println("Selecione a mecanica: ");
        int escolha = leitor.nextInt();

        Mecanica mecanicaSelecionada = mecanicas.get(escolha);

        mecanicaSelecionada.gerarHorarios();

        System.out.println("Selecione o horario: ");
        int horario = leitor.nextInt();

        String horarioSelecionado = mecanicaSelecionada.getHorariosDisponiveis().get(horario);

        System.out.println("AGENDAMENTO FEITO AS " + horarioSelecionado + ", VALOR RECOMENDADO: " + orcamento.getValorOrcamento());
        System.out.println(mecanicaSelecionada.getNome() + ", " + mecanicaSelecionada.getEndereco().getRua() +  ", n"
                + mecanicaSelecionada.getEndereco().getNumero() + ", CEP:" + mecanicaSelecionada.getEndereco().getCep());

    }
}
