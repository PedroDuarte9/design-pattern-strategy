package service;

import br.com.assembleia.novaloja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImposto  {

    public BigDecimal calculadoraImposto(Orcamento orcamento, Imposto imposto ){
        return imposto.calculaImposto(orcamento);
    }
}
