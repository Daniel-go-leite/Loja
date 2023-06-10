package br.com.alura.loja;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoEXtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovado(Orcamento orcamento){
        throw new DomainException("Orcamento foi aprovado!");
    }

    public void reprovado(Orcamento orcamento){
        throw new DomainException("Orcamento nao foi aprovado!");
    }

    public void finalizado(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser finalizado!");
    }




}
