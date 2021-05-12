package model;

public class Motocicleta extends Veiculo{
    private int potenciaEmCc;

    public Motocicleta(String placa, String cor, String marca, String modelo,int potenciaemcc) {
        super(placa, cor, marca, modelo);
        this.setPotenciaemcc(potenciaemcc);
    }
    
    public int getPotenciaemcc() {
        return potenciaEmCc;
    }

    public void setPotenciaemcc(int potenciaEmCc) {
        this.potenciaEmCc = potenciaEmCc;
    }
    
    public String toString(){
        String saida = super.toString();
        saida += "\nPotencia em CC: "+this.getPotenciaemcc();
        return saida;
    }    
}

