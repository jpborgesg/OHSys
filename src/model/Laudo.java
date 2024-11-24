package model;

import java.util.Vector;

public class Laudo {
    private long codigo;
    private double valor;
    private String funcionarioMatriculaFK;
    private String CIDExameFK;

    public Laudo(long codigo, double valor, String funcionarioMatriculaFK, String CIDExameFK) {
        this.codigo = codigo;
        this.valor = valor;
        this.funcionarioMatriculaFK = funcionarioMatriculaFK;
        this.CIDExameFK = CIDExameFK;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFuncionarioMatriculaFK() {
        return funcionarioMatriculaFK;
    }

    public void setFuncionarioMatriculaFK(String funcionarioMatriculaFK) {
        this.funcionarioMatriculaFK = funcionarioMatriculaFK;
    }

    public String getCIDExameFK() {
        return CIDExameFK;
    }

    public void setCIDExameFK(String CIDExameFK) {
        this.CIDExameFK = CIDExameFK;
    }

}
