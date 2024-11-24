package model;

import java.util.Vector;

public class BaseDados {
    private Vector<ExameEspecial> vetorExameEspecial;
    private Vector<ExameClinico> vetorExameClinico;
    private Vector<Funcionario> vetorFuncionario;
    private Vector<Laudo> vetorLaudo;

    public BaseDados() {
        this.vetorFuncionario = new Vector<Funcionario>();
        this.vetorLaudo = new Vector<Laudo>();
        this.vetorExameEspecial = new Vector<ExameEspecial>();
        this.vetorExameClinico = new Vector<ExameClinico>();
    }

    public Vector<ExameEspecial> getVetorExameEspecial() {
        return vetorExameEspecial;
    }

    public Vector<ExameClinico> getVetorExameClinico() {
        return vetorExameClinico;
    }

    public Vector<Funcionario> getVetorFuncionario() {
        return vetorFuncionario;
    }

    public Vector<Laudo> getVetorLaudo() {
        return vetorLaudo;
    }

}
