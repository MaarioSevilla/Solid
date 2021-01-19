/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRPOK;

/**
 *
 * @author sevilla
 */
public interface ICorreoElectronico {
    void SetEmisor(String emisor);
    void SetReceptor(String receptor);
    void SetContenido(IContenido content);
}
