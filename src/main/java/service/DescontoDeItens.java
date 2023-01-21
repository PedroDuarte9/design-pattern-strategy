package service;

import br.com.assembleia.novaloja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoDeItens extends Desconto {

    public DescontoDeItens(Desconto proximo){
        super(proximo);
    }

    @Override
    public BigDecimal calculaDescontoAbstrato(Orcamento orcamento) {
        if(orcamento.getItem() > 5){
            return orcamento.getValor().multiply(new BigDecimal(0.1));

        }
        return proximo.calculaDescontoAbstrato(orcamento);
    }

}
