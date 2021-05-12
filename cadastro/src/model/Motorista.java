package model;

public class Motorista {
    private String nome;
    private String tipoCnh;
    private String numeroCnh;

    public Motorista(String nome, String tipoCnh, String numeroCnh) {
        this.setNome(nome);
        this.setTipoCnh(tipoCnh);
        this.setNumeroCnh(numeroCnh);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoCnh() {
        return tipoCnh;
    }

    public void setTipoCnh(String tipoHabilitacao) {
        this.tipoCnh = tipoCnh;
    }

    public String getNumeroCnh() {
        return numeroCnh;
    }

    public void setNumeroCnh(String numeroCnh) {
        this.numeroCnh = numeroCnh;
    }

    public String toString(){
        String saida;
        saida = "Nome: "+this.getNome() + 
                   "\nTipo da CNH: "+this.getTipoCnh()+
                   "\nNumero da CNH: "+this.getNumeroCnh();
        return saida;
    }
}