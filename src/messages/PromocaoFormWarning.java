/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package messages;

/**
 *
 * @author BrunoAzzi
 */
public enum PromocaoFormWarning {
    
    //AVISOS GERAIS
    //TODO Checar reusabilidade e necessidade disto
    PROMOCAO_CADASTRO_CAMPOS_INVALIDOS("Campos obrigatórios não preenchidos no cadastro de promoções: \n"),
    PROMOCAO_CADASTRO_OBJETO_NULO("Existem campos não preenchidos no cadastro!"),
    
    //AVISOS DE REGRAS DE NEGOCIO
    PROMOCAO_CADASTRO_MES_INVALIDO("Somente é possível cadastrar promoções deste mês!"),
    PROMOCAO_CADASTRO_DIA_INVALIDO("A data de término da promoção não pode ser menor que a data de início da promoção!"),
    PROMOCAO_CADASTRO_DIA_MENOR_QUE_DIA_ATUAL("A data da promoção não deve ser menor que a data atual!"),   
    PROMOCAO_VALOR_MAIOR_OU_IGUAL_DO_PRODUTO("O valor promocional precisa ser menor que o valor atual do produto!"),
    
    //TODO revisar necessidade disto
    PROMOCAO_VALOR_MAIOR_QUE_ZERO("O valor da promoção precisa ser maior que zero!"),
    
    //AVISOS DE CAMPOS NULOS
    PROMOCAO_PRODUTO_NAO_SELECIONADO("Não foi selecionado nenhum produto!"),
    PROMOCAO_DATA_INICIAL_NULA("Data inicial não selecionada!"),
    PROMOCAO_DATA_FINAL_NULA("Data final não selecionada!"),
    PROMOCAO_VALOR_NULO("O Valor da promoção está vazio!");
    
    String descricao;

    private PromocaoFormWarning(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
