package Testes;

import br.com.assembleia.novaloja.desconto.CalculadoraDesconto;
import br.com.assembleia.novaloja.orcamento.Orcamento;
import service.*;

import java.math.BigDecimal;

public class TesteDesconto {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal(200), 6);
        Orcamento segundo = new Orcamento(new BigDecimal(1000), 1);

        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        System.out.printf("%.2f%n", calculadoraDesconto.calcular(primeiro));
        System.out.printf("%.2f%n", calculadoraDesconto.calcular(segundo));




    }
}
