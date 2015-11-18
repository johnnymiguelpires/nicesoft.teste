/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package messages;

/**
 *
 * @author BrunoAzzi
 */
public enum UsuarioFormWarning {
    LOGIN_INVALIDO("O login informado é inválido."), 
    SENHA_INVALIDA("A senha informada é inválida.");
    
    String descricao;

    private UsuarioFormWarning(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
