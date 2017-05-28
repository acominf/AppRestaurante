/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apprestaurant;


import pantallas.IniciarSesion;
import pantallas.MenuPrincipal;

/**
 *
 * @author lucerogarcia
 */
public class AppRestaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ventna de iniciar sesión
        IniciarSesion iniS = new IniciarSesion();
        iniS.setVisible(true); //aparece la ventana de inicio de sesión 
    }
    
}
