package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteComposicao {

    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        novo.adicionarItem(antigo);



        CalculadoraDeDescontos calcula = new CalculadoraDeDescontos();
        System.out.println("Antigo: " + calcula.calcular(antigo));
        System.out.println("Novo: " + calcula.calcular(novo));

    }
}
