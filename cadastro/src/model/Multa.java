package model;

public class Multa {
    private String codigoMulta;
    private double valorMulta;

    public Multa(String codigoMulta, double valorMulta) {
        this.setCodigoMulta(codigoMulta);
        this.setValorMulta(valorMulta);
    }

    public String getCodigoMulta() {
        return codigoMulta;
    }

    public void setCodigoMulta(String codigoMulta) {
        this.codigoMulta = codigoMulta;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    @Override
    public String toString() {
        String saida;
        saida = "Código da multa: "+this.getCodigoMulta()+
               "\nValor da multa: R$"+this.getValorMulta();
        return saida;
    }
}
