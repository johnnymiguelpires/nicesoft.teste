/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package messages;

/**
 *
 * @author GustavoCalandriniPC
 */
public enum RelatorioFormWarning {
    
    DATA_INICIAL_MAIOR_QUE_DATA_FINAL("Data inicial maior que data final");
    
    String descricao;

    RelatorioFormWarning(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
}
