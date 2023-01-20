package service;

import br.com.assembleia.novaloja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoValor implements Desconto{
    @Override
    public BigDecimal calculaDesconto(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal(500)) > 0 ) {
            return orcamento.getValor().multiply(new BigDecimal(0.1));
        }
        return BigDecimal.ZERO;
    }
}
