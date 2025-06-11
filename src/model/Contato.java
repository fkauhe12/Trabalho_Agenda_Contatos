package model;

import java.util.ArrayList;

public class Contato {
    // Atributos
    private String nome;
    private ArrayList<String> telefones = new ArrayList<>();
    private ArrayList<String> emails = new ArrayList<>();
    private Endereco endereco;

    // Construtor
    public Contato(String nome, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.telefones.add(telefone);
        this.emails.add(email);
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getTelefones() {
        return telefones;
    }

    public void adicionarTelefone(String telefone) {
        this.telefones.add(telefone);
    }

    public void setTelefone(String novoTelefone) {
        if (telefones.isEmpty()) {
            telefones.add(novoTelefone);
        } else {
            telefones.set(0, novoTelefone);
        }
    }

    public ArrayList<String> getEmails() {
        return emails;
    }

    public void adicionarEmail(String email) {
        this.emails.add(email);
    }

    public void setEmail(String novoEmail) {
        if (emails.isEmpty()) {
            emails.add(novoEmail);
        } else {
            emails.set(0, novoEmail);
        }
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Método toString
    @Override
    public String toString() {
        return "Nome: " + nome +
               "\nTelefones: " + telefones +
               "\nEmails: " + emails +
               "\nEndereço: " + endereco;
    }
}
