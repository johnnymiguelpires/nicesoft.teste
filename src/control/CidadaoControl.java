/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;
import messages.Titles;
import model.Cidadao;
import org.hibernate.exception.DataException;

/**
 *
 * @author Bruno Azzi
 */
public class CidadaoControl {
    
    public static void add(Cidadao cidadao){
        try {
            Conexao.persist(cidadao);
            Conexao.commit();
        } catch (PersistenceException persistenceException) {
            JOptionPane.showMessageDialog(null, persistenceException.getMessage(),
                    Titles.WARNING.getDescricao(),
                    JOptionPane.ERROR_MESSAGE);
        } catch (DataException dataException) {
            JOptionPane.showMessageDialog(null, dataException.getMessage(),
                    Titles.WARNING.getDescricao(),
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null,
                    exception.getMessage(),
                    Titles.WARNING.getDescricao(),
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static ArrayList<Cidadao> listaCidadaos(){
        return new ArrayList(Conexao.namedQuery("Cidadao.findAll"));
    }
}
