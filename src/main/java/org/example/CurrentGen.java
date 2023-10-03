package org.example;

public class CurrentGen extends Geracao{
    public CurrentGen(double precoBase) {
        super(precoBase);
    }

    @Override
    public double calcularPreco() {
        return this.getPrecoBase()* (1 + this.getVersao().getPcAumentoPreco());
    }
}
