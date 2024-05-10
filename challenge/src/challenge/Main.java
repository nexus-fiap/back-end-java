package challenge;

import challenge.dominio.Endereco;
import challenge.dominio.Mecanica;
import challenge.dominio.Usuario;
import challenge.dominio.Veiculo;
import challenge.servico.*;
import jdk.jshell.Diag;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Usuario> usuariosCadastrados = new ArrayList<>();
        Login autorizacaoDoSite = new Login(usuariosCadastrados);
        Atendimento atendimentoDoSite = new Atendimento();
        String[] diagnosticos = {"Retrovisor", "Motor"};
        Diagnostico diagnostico = new Diagnostico(diagnosticos);
        ArrayList<Veiculo> veiculosVitor = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        veiculosVitor.add(new Veiculo("23X2DD23", "Macan", "Porsche", 2020));

        usuariosCadastrados.add(new Usuario("Vitor", "vitorhsilva.vs@gmail.com",
                "vitorh123", veiculosVitor, new Endereco("Rua XX", 432, "08321332")));

        Usuario vitor = new Usuario("Vitor", "vitorhsilva.vs@gmail.com",
                "vitorh123", veiculosVitor, new Endereco("Rua XX", 432, "08321332"));

        autorizacaoDoSite.validarAcesso(vitor);

        vitor.adicionarVeiculo(new Veiculo("234DFFS4", "X3", "BMW", 2017));

        vitor.adicionarVeiculo(new Veiculo("2DSSA42", "Z4", "BMW", 2020));

        vitor.verVeiculos();

        vitor.getVeiculos().get(1).fazerDescricaoProblema("O Motor deu problema");

        ArrayList<String> diagnosticoVeiculo = diagnostico.fazerDiagnostico(vitor.getVeiculos().get(1));

        Orcamento orcamento = new Orcamento(diagnosticoVeiculo);

        orcamento.gerarOrcamento();

        System.out.println(orcamento.getValorOrcamento());

        ArrayList<Mecanica> mecanicas = new ArrayList<>();

        mecanicas.add(new Mecanica("AutoCar", new Endereco("Rua Beta", 32, "23891782")));
        mecanicas.add(new Mecanica("Roberio Consertos", new Endereco("Rua Alpha", 45, "23487473")));

        Agendamento agendamento = new Agendamento(orcamento, mecanicas, leitor);

        agendamento.agendarHorario();




    }
}