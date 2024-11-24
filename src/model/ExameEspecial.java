package model;

public class ExameEspecial extends Exame {
    private double custo;

    public ExameEspecial(String CID, String nome, double custo) {
        this.setCID(CID);
        this.setNome(nome);
        this.custo = custo;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public boolean isAlterado(double valor) {
        return (valor == 1);
    }
}