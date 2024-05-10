package challenge.dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Mecanica {
    private String nome;
    private Endereco endereco;
    private ArrayList<String> horariosDisponiveis;

    public Mecanica(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.horariosDisponiveis = new ArrayList<>();
    }

    public void gerarHorarios() {
        ArrayList<String> horarios = new ArrayList<>();

        Collections.addAll(horarios,"10:00", "10:30", "11:00", "12:00",
                "14:00", "15:40", "16:20", "18:50", "19:20", "20:00");

        for (int i = 0; i < 5; i++) {
            int randomNumber = (int) (Math.random() * horarios.size());
            horariosDisponiveis.add(horarios.get(randomNumber));
            horarios.remove(randomNumber);
        }

        horariosDisponiveis.sort(Comparator.naturalOrder());

        for (int i = 0; i < horariosDisponiveis.size(); i++) {
            System.out.println(i + " " + horariosDisponiveis.get(i));
        }

    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public ArrayList<String> getHorariosDisponiveis() {
        return horariosDisponiveis;
    }
}
