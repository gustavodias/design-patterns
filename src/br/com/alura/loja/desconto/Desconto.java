package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

	protected Desconto proximo;

	protected Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if (deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		
		return proximo.calcular(orcamento);
	}
	
	public abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	public abstract boolean deveAplicar(Orcamento orcamento);

}
