package challenge.servico;

import challenge.dominio.Usuario;

import java.util.ArrayList;

public class Login {
    private ArrayList<Usuario> usuariosCadastrados;

    public Login(ArrayList<Usuario> usuariosCadastrados) {
        this.usuariosCadastrados = usuariosCadastrados;
    }

    public void adicionarUsuario(Usuario usuario) {
        this.usuariosCadastrados.add(usuario) ;
    }

    public boolean validarAcesso(Usuario usuario) {
        for (Usuario usuarioCadastrado: usuariosCadastrados) {
            if (usuario.getEmail().equals(usuarioCadastrado.getEmail()) &&
                    usuario.getSenha().equals(usuarioCadastrado.getSenha())) {
                usuario.setLogado(true);
                return true;
            }
        }
        usuario.setLogado(false);
        return false;
    }
}
