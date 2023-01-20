package service;

import br.com.assembleia.novaloja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ImpostoISS implements Imposto {
    public BigDecimal calculaImposto(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal(0.06));
    }
}
