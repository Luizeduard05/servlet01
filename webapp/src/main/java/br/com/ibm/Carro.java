package br.com.ibm;

public class Carro extends Veiculos{


    private boolean automatico;
    private boolean esportivo;

    public boolean getAutomatico(){
        return automatico;
    }
    public void setAutomatico(boolean automatico){
        this.automatico = automatico;

    }
    public boolean getEsportivo(){
        return esportivo;
    }
    public void setEsportivo(boolean esportivo){
        this.esportivo = esportivo;
    }

    @Override
    public String getLigar(){
        return "CARRO LIGADO";
    }

    public String getDesligar(){
        return "CARRO DESLIGADO";
    }
    void status(){
        System.out.println("NOME: " +getNome());
        System.out.println("ANO: " +getAno());
        System.out.println("AUTOMATICO: " +automatico);
        System.out.println("ESPORTIVO: " +esportivo);
    }

}
