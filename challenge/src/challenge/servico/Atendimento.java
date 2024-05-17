package challenge.servico;

import challenge.dominio.Usuario;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Atendimento {
    private int chatId = 0;
    private LocalDateTime horarioDia = LocalDateTime.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public void fazerAtendimento (Usuario usuario){
        if (usuario.isLogado()) {
            System.out.println("Atendimento feito");
            System.out.println("Chat Id:" + chatId);
            System.out.println("Horario e Dia:" + horarioDia.format(formatter));
            chatId ++;
            return;
        }
        System.out.println("Sem acesso!");
    }

}
