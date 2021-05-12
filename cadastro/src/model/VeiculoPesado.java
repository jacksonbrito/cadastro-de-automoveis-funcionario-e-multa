package model;

public class VeiculoPesado extends Veiculo{
    private int capacidadeCarga;

    public VeiculoPesado(String placa, String cor, String marca, String modelo,int capCarga) {
        super(placa, cor, marca, modelo);
        this.setCapacidadeCarga(capCarga);
    }
    
    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String toString(){
        String saida = super.toString();
        saida += "\nCapacidade de carga: "+this.getCapacidadeCarga();
        return saida;
    } 
}