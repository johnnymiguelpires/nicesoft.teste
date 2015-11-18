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
import model.Intendencia;
import org.hibernate.exception.DataException;

/**
 *
 * @author Bruno Azzi
 */
public class OrdemStatusControl {
    
    public static void add(Intendencia intendencia){
        try {
            Conexao.persist(intendencia);
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
    
    public static ArrayList<Intendencia> listaIntendencias(){
        return new ArrayList(Conexao.namedQuery("Intendencia.findAll"));
    }
}
