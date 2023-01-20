package Testes;

import br.com.assembleia.novaloja.orcamento.Orcamento;
import service.CalculadoraImposto;
import service.ImpostoICMS;
import service.ImpostoISS;

import java.math.BigDecimal;

public class TesteAplicacao {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal(100),1);
        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
        System.out.printf("%.2f%n" , calculadoraImposto.calculadoraImposto(orcamento, new ImpostoICMS()));
        System.out.printf("%.2f%n" , calculadoraImposto.calculadoraImposto(orcamento, new ImpostoISS()));



    }
}
