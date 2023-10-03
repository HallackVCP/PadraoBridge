package org.example;

public abstract class Geracao {
    protected Versao versao;

    protected double precoBase;

    public Geracao(double precoBase) {
        this.precoBase = precoBase;
    }

    public Versao getVersao() {
        return versao;
    }

    public void setVersao(Versao versao) {
        this.versao = versao;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public abstract double calcularPreco();
}
