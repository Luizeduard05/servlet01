package br.com.ibm;

public abstract class Veiculos {

    private String nome;
    private int ano;
    private String ligar;
    private String desligar;


    public Veiculos() {

    }

    public Veiculos(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    void status(){
        System.out.println(nome);
        System.out.println(ano);
        System.out.println(ligar);
        System.out.println(desligar);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        if(ano >=0) {
            this.ano = ano;
        }
    }

    public String getLigar(){
        return ligar = "LIGADO";
    }

    public void setLigar(String ligar) {
        this.ligar = ligar;

    }

    public String getDesligar() {
        return desligar = "DESLIGADO";
    }
    public void setDesligar(String desligar) {
        this.desligar = desligar;

    }
}
