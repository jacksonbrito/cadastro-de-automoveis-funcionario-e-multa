package model;

public class VeiculoLeve extends Veiculo{
    private int potenciaEmCv;

    public VeiculoLeve(String placa, String cor, String marca, String modelo,int potenciaemcv) {
        super(placa, cor, marca, modelo);
        this.setPotenciaemcv(potenciaemcv);
    }
    
    public int getPotenciaemcv() {
        return potenciaEmCv;
    }

    public void setPotenciaemcv(int potenciaEmCv) {
        this.potenciaEmCv = potenciaEmCv;
    }

    @Override
    public String toString(){
       String saida = super.toString();
       saida += "\nPotencia em CV: "+this.getPotenciaemcv();
       return saida;
    }
}