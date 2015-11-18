/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package messages;

/**
 *
 * @author bruno_azzi
 */
public enum Warnings {
    
    OBJETO_NAO_ENCONTRADO("A consulta do banco nao retornou resultados."), 
    QUANTIDADE_DE_PRODUTOS_EXCEDENTE("Nao foi possivel adicionar o produto no carrinho.\nA quantidade de produtos excede o estoque."), 
    QUANTIDADE_EXCEDENTE_EM_ESTOQUE("A quantidade informada excede a quantidade do produto em estoque."), 
    COMPRA_INSUCESSO("Houve problemas com sua compra, entre em contato com um representante."), 
    CARRINHO_VAZIO("Nao constam produto no carrinho de compras.");

    final String descricao;
    
    private Warnings(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
