/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSP;

/**
 *
 * @author sevilla
 */
public class Rectangulo {
    public int Alto;
    public int Ancho;

    public int getAlto() {
        return Alto;
    }

    public int getAncho() {
        return Ancho;
    }

    public void setAlto(int alto) {
        Alto = alto;
    }

    public void setAncho(int ancho) {
        Ancho = ancho;
    }

    public int GetArea() {
        return Alto * Ancho; 
    }
}
