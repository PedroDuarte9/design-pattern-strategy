package service;

import br.com.assembleia.novaloja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoValor extends Desconto{

    public DescontoValor(Desconto proximo){
        super(proximo);
    }
    @Override
    public BigDecimal calculaDescontoAbstrato(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal(500)) > 0 ) {
            return orcamento.getValor().multiply(new BigDecimal(0.1));
        }
        return proximo.calculaDescontoAbstrato(orcamento);
    }
}
