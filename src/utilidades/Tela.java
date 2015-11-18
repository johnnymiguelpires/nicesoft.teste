/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;

/**
 *
 * @author brunoazzi
 */
public class Tela {

    public static final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    public static final int screenHeight = (SCREEN_SIZE.height - 90);
    public static final int screenWidth = SCREEN_SIZE.width;

    //CATEGORIA
    public static Dimension menuCategoriaDimension() {
        return new Dimension(screenWidth, (int) (screenHeight * 0.2));
    }

    public static Dimension menuCategoriaScrollPaneDimension() {
        return new Dimension((int) (screenWidth * 0.5), (int) (screenHeight * 0.2));
    }

    public static Rectangle menuCategoriaBounds() {
        return new Rectangle(0, 0, screenWidth, (int) (screenHeight * 0.2));
    }

    //PROMOCAO
    public static Dimension menuPromocoesDimension() {
        return new Dimension(screenWidth, (int) (screenHeight * 0.2));
    }
    
    public static Rectangle menuPromocoesBounds() {
        return new Rectangle(0, (int) (screenHeight * 0.1), screenWidth, (int) (screenHeight * 0.3));
    }

    //PRODUTOS
    public static Rectangle menuProdutosBounds() {
        return new Rectangle(0, (int) (screenHeight * 0.4), (int) (screenWidth * 0.4), (int) (screenHeight * 0.6) - 20);
    }

    public static Dimension menuProdutosDimension() {
        return new Dimension((int) (screenWidth * 0.4), (int) (screenHeight * 0.5));
    }

    //DESCRICAO PRODUTO
    public static Rectangle menuIntendencia() {
        return new Rectangle(0, 0, screenWidth , screenHeight);
    }

    //SCREEN SIZE
    public static Dimension screenSizeTratado() {
        return new Dimension((int) (screenWidth), (int) (screenHeight));
    }
    
    //METADE DA TELA
    public static int metadeHeight(){
        return screenHeight/2;
    }
    
    public static int metadeWidth(){
        return screenWidth/2;
    }
}
