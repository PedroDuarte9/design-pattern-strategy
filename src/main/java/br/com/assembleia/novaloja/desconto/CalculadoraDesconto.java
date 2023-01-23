package br.com.assembleia.novaloja.desconto;

import br.com.assembleia.novaloja.orcamento.Orcamento;
import service.*;

import java.math.BigDecimal;

public class CalculadoraDesconto  {

    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoValor(new DescontoDeItens(new SemDesconto()));
        return desconto.calcular(orcamento);
    }

}
