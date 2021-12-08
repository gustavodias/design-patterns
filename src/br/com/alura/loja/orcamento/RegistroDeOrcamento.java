package br.com.alura.loja.orcamento;

import br.com.alura.loja.http.HttpAdapter;
import br.com.alura.loja.orcamento.situacao.DomainException;

import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        if (!orcamento.isFinalizado()){
            throw new DomainException("Orçamento não finalizado!");
        }
        String url = "http://localhost:8080";
        Map<String, Object> dados = Map.of("valor", orcamento.getValor(),
                "quantidadeItenss", orcamento.getQuantidadeItens());
        http.post(url, dados);
    }
}
