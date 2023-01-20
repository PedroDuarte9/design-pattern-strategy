package service;

import br.com.assembleia.novaloja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoDeItens implements Desconto {

    @Override
    public BigDecimal calculaDesconto(Orcamento orcamento) {
        if(orcamento.getItem() > 5){
            return orcamento.getValor().multiply(new BigDecimal(0.1));

        }
        return BigDecimal.ZERO;
    }
}
