package Testes;

import br.com.assembleia.novaloja.desconto.CalculadoraDesconto;
import br.com.assembleia.novaloja.orcamento.Orcamento;
import service.*;

import java.math.BigDecimal;

public class TesteDesconto {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal(200), 6);
        Orcamento segundo = new Orcamento(new BigDecimal(1000), 1);
        DescontoValor desconto = new DescontoValor();
        DescontoDeItens descontoDeItens = new DescontoDeItens();
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        System.out.printf("%.2f%n", calculadoraDesconto.calculaDesconto(primeiro, desconto));
        System.out.printf("%.2f%n", calculadoraDesconto.calculaDesconto(primeiro, descontoDeItens));
        System.out.printf("%.2f%n", calculadoraDesconto.calculaDesconto(segundo, desconto));


    }
}
