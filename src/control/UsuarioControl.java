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
import model.Usuario;
import org.hibernate.exception.DataException;

/**
 *
 * @author Bruno Azzi
 */
public class UsuarioControl {

    public static void add(Usuario usuario) {
        try {
            Conexao.persist(usuario);
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

    public static ArrayList<Usuario> listaIntendencias() {
        return new ArrayList(Conexao.namedQuery("Usuario.findAll"));
    }

    public static void delete(Usuario usuario) {
        if (JOptionPane.showConfirmDialog(null, messages.ConfirmMessages.DELETAR_CONFIRMACAO.getDescricao()) == JOptionPane.YES_OPTION) {
            Conexao.remove(usuario);
            Conexao.commit();
        }
    }
    
    public static void update(Usuario usuario){
        Conexao.merge(usuario);
        Conexao.commit();
    }
}
