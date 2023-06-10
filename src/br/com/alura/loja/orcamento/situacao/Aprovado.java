package br.com.alura.loja;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento{
    public BigDecimal calculaValorDescontoExtra(Orcamento orcamento){
        return orcamento.getvalor().multiply(new BigDecimal("0.02"));
    }
    public void finaliza(Orcamento orcamento){
        orcamento.setSituacao(new Finaliza());
    }
}
