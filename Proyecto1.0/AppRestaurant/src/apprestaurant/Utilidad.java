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
    
    public static Usuario buscarUsuario(ArrayList<Usuario> usuarios, String correo)
    {
        Usuario actual = null;
        for(int i =0 ; i<usuarios.size();i++)//buscar si existe en el arraylist
        {
            actual = usuarios.get(i);
            if(actual.accedeCorreo().equals(correo))//checar info
            {
                return actual;
            }
        }
        return actual;
    }
    
    public static Restaurante buscarRestaurante(ArrayList<Usuario> usuarios, String correo, String nombreR)
    {
        Usuario actual = Utilidad.buscarUsuario(usuarios, correo);
        ArrayList<Restaurante> rests = actual.accedeRestaurantes();
        Restaurante res = null;
        for(int i = 0 ; i<rests.size(); i++)//buscar si existe en el arraylist
        {
            res = rests.get(i);
            if(res.accedeNombre().equals(nombreR))
                return res;
        }
        return res;
    }
    
    public static Empleado buscarEmpleado(ArrayList<Usuario> usuarios, String correoDueño, String nombreR, String correoEmpleado)
    {
        Restaurante actual = Utilidad.buscarRestaurante(usuarios, correoDueño, nombreR);
        ArrayList<Empleado> empls = actual.regresaEmpleados();
        Empleado emp = null;
        for(int i = 0 ; i<empls.size(); i++)//buscar si existe en el arraylist
        {
            emp = empls.get(i);
            if(emp.accedeNombre().equals(nombreR))
            {
                return emp;
            }
        }
        return emp;
    }
    
    public static Empleado convertirUsuario(ArrayList<Usuario> usuarios, String correo, String h1, String h2, String s)
    {
        Usuario actual;
        Empleado nuevo;
        String nom = "", corr = "", cont = "";
        ArrayList<Restaurante> rests = null;
        for(int i =0 ; i<usuarios.size();i++)//buscar si existe en el arraylist
        {
            actual = usuarios.get(i);
            if(actual.accedeCorreo().equals(correo))//checar info
            {
                nom = actual.accedeNombre();
                corr = actual.accedeCorreo();
                cont = actual.accedeContraseña();
                rests = actual.accedeRestaurantes();
                usuarios.remove(i--);
                
            }
        }
        if(s.equals("Cocinero"))
        {
            nuevo = new Cocinero(nom,corr,h1,h2, cont);
        }
        else
        {
            nuevo = new Mesero(nom,corr,h1,h2, cont);
        }
        System.out.println(nuevo.accedeNombre() + nuevo.accedeCorreo() + nuevo.accedeContraseña() + nuevo.accedeH1() + nuevo.accedeH2());
        usuarios.add((Usuario)nuevo);
        Utilidad.guardarUsuarios(usuarios);
        return nuevo;
    }
}
