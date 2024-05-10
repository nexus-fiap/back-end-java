package challenge.dominio;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private ArrayList<Veiculo> veiculos;
    private Endereco endereco;
    private boolean logado;

    public Usuario(String nome, String email, String senha, ArrayList<Veiculo> veiculos, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.veiculos = veiculos;
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        if (logado) {
            this.veiculos.add(veiculo) ;
            System.out.println(nome + ", veículo adicionado!");
            return;
        }
        System.out.println(nome + ", acesso negado!");
    }

    public void removerVeiculo(String placa) {
        if (logado) {
            for (Veiculo veiculoSelecionado: veiculos) {
                if (veiculoSelecionado.getPlaca().equals(placa)) {
                    this.veiculos.remove(veiculoSelecionado);
                    System.out.println(nome + ", veículo removido!");
                    return;
                }
            }
            System.out.println(nome + ", veículo não encontrado!");
            return;
        }
        System.out.println(nome + ", acesso negado!");
    }

    public void verVeiculos() {
        if (logado) {
            for (Veiculo veiculoSelecionado: veiculos) {
                System.out.println(veiculoSelecionado.descreverCarro() + "\n") ;
            }
            return;
        }
        System.out.println(nome + ", acesso negado!");
    }



}
