package model;

public class ContatoProfissional extends Contato {
    private String empresa;
    private String cargo;

    // Construtor
    public ContatoProfissional(String nome, String telefone, String email, Endereco endereco, String empresa, String cargo) {
        super(nome, telefone, email, endereco);
        this.empresa = empresa;
        this.cargo = cargo;
    }

    // Getters e Setters
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + 
               ", ContatoProfissional{" +
               "empresa='" + empresa + '\'' +
               ", cargo='" + cargo + '\'' +
               '}';
    }

    
}
