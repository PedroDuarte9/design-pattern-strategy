package br.com.assembleia.novaloja.orcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private int item;

    public Orcamento(BigDecimal valor, int item) {
        this.valor = valor;
        this.item = item;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getItem() {
        return item;
    }
}
