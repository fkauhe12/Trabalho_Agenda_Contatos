package model;

public class ContatoPessoal extends Contato {
    // Atributos
    private String dataAniversario;

    // Construtor
    public ContatoPessoal(String nome, String telefone, String email, Endereco endereco, String dataAniversario) {
        super(nome, telefone, email, endereco);
        this.dataAniversario = dataAniversario;
    }

    // Getters e Setters
    public String getDataAniversario(){ 
        return dataAniversario; 
    }
    public void setDataAniversario(String dataAniversario){ 
        this.dataAniversario = dataAniversario; 
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + "\nData de Aniversário: " + dataAniversario;
    }
}
