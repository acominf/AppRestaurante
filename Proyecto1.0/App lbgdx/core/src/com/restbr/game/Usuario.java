package com.restbr.game;
import java.util.ArrayList;

/**
 * Created by lucerogarcia on 29/04/17.
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
