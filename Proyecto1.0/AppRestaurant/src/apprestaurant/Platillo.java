/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apprestaurant;

/**
 *
 * @author lucerogarcia
 */
public class Platillo {
    private String nombre;
    private String tipo;
    private float costo;
    private String descripcion;
    //considerar variable para foto

    public Platillo(String nom, String t, float c, String d) {
            nombre = nom;
            tipo = t;
            costo = c;
            descripcion = d;
    }

  
    public String accederNombre()
    {
        return  nombre;
    }

    public float costo() {
        return costo;
    }

    public String accedeNombre() {
         return nombre;
    }

    public String accedeDescrip() {
         return descripcion;
                 }

    public String accedeTipo() {
        return tipo;
    }

}


