package model;

public class ExameClinico extends Exame {
    private double valorMin;
    private double valorMax;

    public ExameClinico(String CID, String nome, double valorMin, double valorMax) {
        this.setCID(CID);
        this.setNome(nome);
        this.valorMin = valorMin;
        this.valorMax = valorMax;
    }

    public double getValorMax() {
        return valorMax;
    }

    public void setValorMax(double valorMax) {
        this.valorMax = valorMax;
    }

    public double getValorMin() {
        return valorMin;
    }

    public void setValorMin(double valorMin) {
        this.valorMin = valorMin;
    }

    public boolean isAlterado(double valor) {
        return (valor < valorMin) || (valor > valorMax);
    }
}
