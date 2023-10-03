package org.example;

public class NextGen extends Geracao{
    public NextGen(double precoBase) {
        super(precoBase);
    }

    @Override
    public double calcularPreco() {
        return (this.getPrecoBase()*1.10)+(this.getPrecoBase()*this.getVersao().getPcAumentoPreco());
    }
}
