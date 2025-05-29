package model;

import java.util.ArrayList;

public class Contato {
    // Atributos
    private String nome;
    private ArrayList<String> telefones;
    private ArrayList<String> emails;
    Endereco endereco;

    // Construtor
    public Contato(String nome, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.telefones = new ArrayList<>();
        this.emails = new ArrayList<>();
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome)  {
        this.nome = nome;
    }
   
    public ArrayList<String> getTelefones() {
        return telefones;
    }
    public void setTelefones(ArrayList<String> telefones) {
        this.telefones = telefones;
    }

    public ArrayList<String> getEmails() {
        return emails;
    }
    public void setEmails(ArrayList<String> emails) {
        this.emails = emails;
    }


    public Endereco getEndereco() {
        return endereco;
    }

    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Métodos
    public void adicionarTelefone(String telefone) {
        this.telefones.add(telefone);
    }

    public void adicionarEmail(String email) {
        this.emails.add(email);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefones=" + telefones +
                ", emails=" + emails +
                ", endereco=" + endereco +
                '}';
    }
}