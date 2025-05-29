package controller;

import java.util.ArrayList;
import java.util.List;
import model.Contato;

public class Agenda {
    // Atributos
    private List<Contato> contatos;

    // Construtor
    public Agenda() {
        this.contatos = new ArrayList<>();
    }
    // Métodos
    public void adicionarContato(Contato contato) {
        this.contatos.add(contato);
    }
    public void removerContato(Contato contato) {
        this.contatos.remove(contato);
    }
    public Contato buscarContatoPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null; // Retorna null se não encontrar
    }
    public List<Contato> listarTodos() {
        return new ArrayList<>(contatos); // Retorna uma cópia da lista de contatos
    }
    public void editarContato(Contato contatoAntigo, Contato contatoNovo) {
        int index = contatos.indexOf(contatoAntigo);
        if (index != -1) {
            contatos.set(index, contatoNovo);
        }
    }
    
}
