/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package messages;

/**
 *
 * @author bruno_azzi
 */
public enum ConfirmMessages {
    
    CATEGORIA_ADICIONAR_CONFIRMACAO("Deseja salvar esta(s) categoria(s)?"),
    PROMOCAO_ADICIONAR_CONFIRMACAO("Deseja salvar esta(s) promoção(ões)?"),
    ADICIONAR_CONFIRMACAO("Deseja mesmo salvar este(s) registro(s)?"), 
    DELETAR_CONFIRMACAO("Tem certeza que deseja deletar o registro selecionado?"),
    PRODUTO_ADICIONAR_CONFIRMACAO("Deseja salvar este(s) produto(s)?"), 
    EDITAR_CONFIRMACAO("Deseja mesmo editar este registro?"), 
    GERAR_RELATORIO("Deseja gerar este relatorio?"), 
    COMPRAR_CONFIRMACAO("Tem certeza que deseja efetuar esta compra?");
    
    String descricao;

    private ConfirmMessages(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
