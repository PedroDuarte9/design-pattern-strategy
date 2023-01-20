package br.com.assembleia.novaloja.desconto;

import br.com.assembleia.novaloja.orcamento.Orcamento;
import service.Desconto;
import service.Imposto;

import java.math.BigDecimal;

public class CalculadoraDesconto  {
    public BigDecimal calculaDesconto(Orcamento orcamento, Desconto desconto ){
        return desconto.calculaDesconto(orcamento);
    }
}
