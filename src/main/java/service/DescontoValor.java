package service;

import br.com.assembleia.novaloja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoValor extends Desconto{

    public DescontoValor(Desconto proximo){
        super(proximo);
    }
    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
            return orcamento.getValor().multiply(new BigDecimal(0.1));
        }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal(500)) > 0;
    }
}
