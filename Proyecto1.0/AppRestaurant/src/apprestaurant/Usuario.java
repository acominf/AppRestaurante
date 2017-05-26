/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apprestaurant;
import java.util.ArrayList;
/**
 *
 * @author lucerogarcia
 */
public class Usuario
{
    private String nombre;
    private String correoElectronico;
    private ArrayList<Restaurante> restaurantes;

    /**
     * Constructor de Usuario
     * @param nom nombre del Usuario
     * @param correo Correo Electronico del Usuario
     */
    public Usuario(String nom, String correo)
    {
        restaurantes = new ArrayList<Restaurante>();
        nombre=nom;
        correoElectronico = correo;
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
