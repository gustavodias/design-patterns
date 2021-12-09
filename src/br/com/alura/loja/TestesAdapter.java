package br.com.alura.loja;

import br.com.alura.loja.http.JavaHttpClient;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;

public class TestesAdapter {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento();
        primeiro.aprovar();
        primeiro.finalizar();

        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
        registroDeOrcamento.registrar(primeiro);
    }
}
