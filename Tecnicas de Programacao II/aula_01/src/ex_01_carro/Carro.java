package ex_01_carro;

public class Carro {
    //Atributos da classe
    private String marca;
    private String cor;
    private String modelo;
    private double potencia;
    private double velocidade;
    private int ano;

    //Método(s) Construtor(es)
    public Carro() {

    }

    //getter e setter


    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public Carro(String aMarca, String aCor, String oModelo, int oAno){
        this.marca = aMarca;
        this.cor = aCor;
        this.modelo = oModelo;
        this.ano = oAno;
    }

    //Métodos
    public void acelerar(double potencia) {
        velocidade+= potencia;
    }

    private void reduzir(){
        velocidade-=potencia;
    }

    public void frear() {
        while (velocidade != 0) {
            reduzir();
        }
    }

    public boolean ehIgual(Carro c1, Carro c2) {
        return c1.marca.equalsIgnoreCase(c2.marca) && c1.modelo.equalsIgnoreCase(c2.modelo) && c1.cor.equalsIgnoreCase(c2.cor) && c1.ano == c2.ano;
    }
}
