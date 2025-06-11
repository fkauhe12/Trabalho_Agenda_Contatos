package model;

public class Endereco {
    // Atributos
    private String rua, cidade, estado, cep;

    // Construtor
    public Endereco(String rua, String cidade, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    // Getters e Setters
    public String getRua(){
        return rua; 
    }
    public void setRua(String rua){ 
        this.rua = rua; 
    }

    public String getCidade(){
        return cidade; 
    }
    public void setCidade(String cidade){
        this.cidade = cidade; 
    }

    public String getEstado(){
        return estado; 
    }
    public void setEstado(String estado){
        this.estado = estado; 
    }

    public String getCep(){
        return cep; 
    }
    public void setCep(String cep){ 
        this.cep = cep; 
    }

    // Método toString
    @Override
    public String toString() {
        return rua + ", " + cidade + " - " + estado + ", CEP: " + cep;
    }
}
