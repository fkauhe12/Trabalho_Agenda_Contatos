package model;

public class ContatoPessoal extends Contato {
    private String dataAniversario;

    public ContatoPessoal(String nome, String telefone, String email, Endereco endereco, String dataAniversario) {
        super(nome, telefone, email, endereco);
        this.dataAniversario = dataAniversario;
    }

    public String getDataAniversario(){ 
        return dataAniversario; 
    }
    public void setDataAniversario(String dataAniversario){ 
        this.dataAniversario = dataAniversario; 
    }

    @Override
    public String toString() {
        return super.toString() + "\nData de Aniversário: " + dataAniversario;
    }
}
