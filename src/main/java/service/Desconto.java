package service;

import br.com.assembleia.novaloja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Desconto {

    public BigDecimal calculaDesconto(Orcamento orcamento);
}
