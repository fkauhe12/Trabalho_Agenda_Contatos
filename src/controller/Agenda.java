package controller;

import java.util.ArrayList;
import java.util.List;
import model.Contato;

public class Agenda {
    private List<Contato> contatos = new ArrayList<>();

    // Método para adicionar contato
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    // Método para remover contato pelo nome
    public boolean removerContato(String nome) {
        Contato c = buscarPorNome(nome);
        if (c != null) {
            contatos.remove(c);
            return true;
        }
        return false;
    }

    // Método para remover contato pelo objeto
    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }

    // Métodos para buscar contatos
    public Contato buscarPorNome(String nome) {
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    // Método para listar todos os contatos
    public List<Contato> listarTodos() {
        return new ArrayList<>(contatos);
    }

    // Método para editar um contato
    public void editarContato(Contato antigo, Contato novo) {
        int i = contatos.indexOf(antigo);
        if (i != -1) {
            contatos.set(i, novo);
        }
    }
}
