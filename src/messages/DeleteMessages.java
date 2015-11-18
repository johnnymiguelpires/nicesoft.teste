/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package messages;

/**
 *
 * @author BrunoAzzi
 */
public enum DeleteMessages {
    
    CATEGORIA_IMPOSSIBILIDADE("Não foi possível deletar a categoria selecionada pois ela possui produtos vinculados a ela."),
    CATEGORIA_SUCESSO("A Categoria selecionada foi removida com sucesso."), 
    PRODUTO_IMPOSSIBILIDADE("Não foi possível deletar o produto selecionado."),
    PRODUTO_SUCESSO("O produto selecionado foi removido com sucesso."), 
    PROMOCAO_IMPOSSIBILIDADE("Não foi possível deletar a promocão selecionada."), 
    USUARIO_SUCESSO("O Usuario selecionado foi removida com sucesso."),
    USUARIO_IMPOSSIBILIDADE("Não foi possível deletar o usuario selecionado."), ;
    
    String descricao;
    
    private DeleteMessages(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
