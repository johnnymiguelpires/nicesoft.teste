/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package messages;

/**
 *
 * @author BrunoAzzi
 */
public enum Titles {
    
    WARNING("Aviso!"),
    CONFIRM("Confirme!"), 
    SUCESSO("Operação bem sucedida!");
    
    String descricao;

    private Titles(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
