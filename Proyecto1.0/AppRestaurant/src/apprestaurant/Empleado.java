/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apprestaurant;

import java.io.Serializable;
import sun.security.util.Password;

/**
 *
 * @author lucerogarcia
 */
public class Empleado extends Usuario implements Serializable
{
    private String horInicio;
    private String horFin;
    private Boolean disponibilidad;

    /**
     * Constructor de Usuario
     *
     * @param nom    nombre del Usuario
     * @param correo Correo Electronico del Usuario
     * @param hor
     */
    public Empleado(String nom, String correo, String hor, String hor1, String cont)
    {
        super(nom, correo, cont);
        horInicio = hor;
        horFin = hor1;
    }
    
    public String accedeNombre()
    {
        return super.accedeNombre();
    }
    
    public String accedeCorreo()
    {
        return super.accedeCorreo();
    }
    
    public String accedeH1()
    {
        return horInicio;
    }
    
    public String accedeH2()
    {
        return horFin;
    }
}
