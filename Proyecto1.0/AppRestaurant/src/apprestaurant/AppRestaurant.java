/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apprestaurant;


import java.util.ArrayList;
import pantallas.IniciarSesion;

/**
 *
 * @author lucerogarcia
 */
public class AppRestaurant {
    public static ArrayList<Usuario> usuarios;
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Ventna de iniciar sesión
        usuarios = Utilidad.leerUsuarios();
        IniciarSesion iniS = new IniciarSesion();
        iniS.setVisible(true); //aparece la ventana de inicio de sesión 
    }
}
