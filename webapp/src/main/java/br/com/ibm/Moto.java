package br.com.ibm;

public class Moto extends Veiculos{

    private boolean bau;
    private int cilindradas;

    public boolean getBau(){
        return bau;
    }
    public void setBau(boolean bau){
        this.bau = bau;
    }

    public int getCilindradas(){
        return cilindradas;
    }
    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }

    @Override
    public String getLigar(){
        return "MOTO LIGADA";
    }
    public String getDesligar(){
        return "MOTO DESLIGADA";
    }

    void status(){
        System.out.println("NOME: " +getNome());
        System.out.println("ANO: " +getAno());
        System.out.println("BAU: "+bau);
        System.out.println("CILINDRADAS: "+cilindradas);
    }
}
