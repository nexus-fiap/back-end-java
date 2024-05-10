package challenge;

import challenge.dominio.Endereco;
import challenge.dominio.Usuario;
import challenge.dominio.Veiculo;
import challenge.servico.Atendimento;
import challenge.servico.Login;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Usuario> usuariosCadastrados = new ArrayList<>();
        Login autorizacaoDoSite = new Login(usuariosCadastrados);
        Atendimento atendimentoDoSite = new Atendimento();
        ArrayList<Veiculo> veiculosVitor = new ArrayList<>();

        veiculosVitor.add(new Veiculo("23X2DD23", "Macan", "Porsche", 2020));

        usuariosCadastrados.add(new Usuario("Vitor", "vitorhsilva.vs@gmail.com",
                "vitorh123", veiculosVitor, new Endereco("Rua XX", 432, "08321332")));

        Usuario vitor = new Usuario("Vitor", "vitorhsilva.vs@gmail.com",
                "vitorh123", veiculosVitor, new Endereco("Rua XX", 432, "08321332"));

        autorizacaoDoSite.validarAcesso(vitor);

        vitor.adicionarVeiculo(new Veiculo("234DFFS4", "X3", "BMW", 2017));

        vitor.verVeiculos();

        vitor.verVeiculos();


    }
}