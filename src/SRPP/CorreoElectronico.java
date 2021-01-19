/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRPP;

/**
 *
 * @author sevilla
 */


public class CorreoElectronico {
    public interface IContenido {
    String GetContenidoSerializado(); // para serializar el contenido
    }
    
    public interface ICorreoElectronico {
    void SetEmisor(String emisor);
    void SetReceptor(String receptor);
    void SetContenido(IContenido content);
    }
    public class CorreoElectronicos implements ICorreoElectronico {
    public void SetEmisor(String sender) {

    }
    public void SetReceptor(String receiver) {

    }
    public void SetContenido(IContenido content) {

    }
    
    }
}
