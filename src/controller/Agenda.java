package controller;

import java.util.ArrayList;
import java.util.List;
import model.Contato;

public class Agenda {
    private List<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }

    public Contato buscarPorNome(String nome) {
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    public List<Contato> listarTodos() {
        return new ArrayList<>(contatos);
    }

    public void editarContato(Contato antigo, Contato novo) {
        int i = contatos.indexOf(antigo);
        if (i != -1) {
            contatos.set(i, novo);
        }
    }
}
