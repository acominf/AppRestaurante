/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apprestaurant;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pantallas.Registro;

/**
 *
 * @author Víctor
 */
public class Utilidad {
    
    public static ArrayList<Usuario> leerUsuarios()
    {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ObjectInputStream input = null;
        InputStream streamIn = null;
        InputStream buffer = null;
        try {
            streamIn = new FileInputStream("usuarios.bin");
            buffer = new BufferedInputStream(streamIn);
            input = new ObjectInputStream(buffer);
            usuarios = (ArrayList<Usuario>) input.readObject();
        } catch(IOException | ClassNotFoundException ex){
        }finally {
            if(input != null){
                try{
                    input.close();
                } catch (IOException ex) {  }
            } 
        }
        return usuarios;
    }
    
    public static void guardarUsuarios(ArrayList<Usuario> usuarios)
    {
        ObjectOutputStream oos = null;
        FileOutputStream fout = null;
        OutputStream buffer = null;
        try{
            fout = new FileOutputStream("usuarios.bin");
            buffer = new BufferedOutputStream(fout);
            oos = new ObjectOutputStream(buffer);
            oos.writeObject(usuarios);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if(oos  != null){
                try {
                    oos.close();
                    buffer.close();
                    fout.close();
                } catch (IOException ex) {
                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
        }
    }
}  