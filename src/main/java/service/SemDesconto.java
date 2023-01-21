package service;

import br.com.assembleia.novaloja.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto{


    public SemDesconto(){
        super(null);
    }

    @Override
    public BigDecimal calculaDescontoAbstrato(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
