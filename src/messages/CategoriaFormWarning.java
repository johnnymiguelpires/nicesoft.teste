/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package messages;

/**
 *
 * @author BrunoAzzi
 */
public enum CategoriaFormWarning {
    
    CATEGORIA_CADASTRO_CAMPOS_INVALIDOS("Campo inválido no cadastro de categorias!"),
    NOME_INVALIDO("O campo nome esta invalido."),
    IMAGEM_INVALIDA("O arquivo indicado e invalido.");
    
    String descricao;

    private CategoriaFormWarning(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
