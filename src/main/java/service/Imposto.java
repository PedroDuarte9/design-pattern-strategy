package service;

import br.com.assembleia.novaloja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    public BigDecimal calculaImposto(Orcamento orcamento);
}
