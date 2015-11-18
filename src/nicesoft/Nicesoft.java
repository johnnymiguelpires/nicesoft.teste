/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicesoft;

import control.Conexao;
import control.IntendenciaControl;
import model.Intendencia;

/**
 *
 * @author Bruno Azzi
 */
public class Nicesoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Intendencia intendencia1 = new Intendencia("bruno", 123, 123, 123);
        IntendenciaControl.add(intendencia1);
        for (Intendencia intendencia : IntendenciaControl.listaIntendencias()) {
            System.out.println("Intendencia: "+intendencia.getNome());
        }

        
        Conexao.endConnection();
    }
    
}
