/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apprestaurant;
import java.util.ArrayList;
import sun.security.util.Password;
/**
 *
 * @author lucerogarcia
 */
public class Usuario
{
    private String nombre;
    private String correoElectronico;
    private String contraseña;
    private ArrayList<Restaurante> restaurantes;

    /**
     * Constructor de Usuario
     * @param nom nombre del Usuario
     * @param correo Correo Electronico del Usuario
     */
    public Usuario(String nom, String correo, String cont)
    {
        restaurantes = new ArrayList<Restaurante>();
        nombre=nom;
        correoElectronico = correo;
        contraseña = cont;
    }
    
    public String accedeContraseña()
    {
        return contraseña;
    }
    
    
    public String accedeNombre()
    {
        return nombre;
    }
    
    public String accedeCorreo()
    {
        return correoElectronico;
    }
    /**
     *
     * @param nuevo restaurante a agrega
     */
    public void crearRestaurante(Restaurante nuevo)
    {
        restaurantes.add(nuevo);
    }

    public Restaurante buscarRestaurante(String nombre)
    {
        for(Restaurante r : restaurantes)
        {
            if(r.regresaNombre() == nombre)
            {
                return r;
            }
        }
        return null;
    }
}
