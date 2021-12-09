package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

public class TesteImposto {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento();
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        System.out.println(calculadoraDeImpostos.calcular(primeiro, new ICMS(new ISS(null))));
    }
}
