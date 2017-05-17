package com.restbr.game;

/**
 * Created by lucerogarcia on 29/04/17.
 * Clase empleado
 */

public class Empleado extends Usuario
{
    private String horario;
    private Boolean disponibilidad;

    /**
     * Constructor de Usuario
     *
     * @param nom    nombre del Usuario
     * @param correo Correo Electronico del Usuario
     */
    public Empleado(String nom, String correo, String hor)
    {
        super(nom, correo);
        horario = hor;
    }


}


