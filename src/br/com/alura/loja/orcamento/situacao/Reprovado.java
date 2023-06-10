package br.com.alura.loja;

public class Reprovado extends SituacaoOrcamento {
    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }



}
