/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apprestaurant;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
/**
 *
 * @author lucerogarcia
 */
public class Restaurante
{
    private String nombre;
    private String direccion;
    private String telefono;
    private String horarioInicio;
    private String horarioFin;
    private ArrayList<Empleado> empleados;
    private ArrayList<Mesa> mesas;
    private Menu menu;

    public Restaurante(String nom, String dir, String tel, String hor1,String hor2)
    {
        nombre = nom;
        direccion = dir;
        telefono = tel;
        horarioInicio = hor1;
        horarioFin = hor2;
        empleados = new ArrayList<Empleado>();
        mesas = new ArrayList<Mesa>();
        menu = new Menu();
    }

    public ArrayList<Mesa> mesasRes()
    {
        return mesas;
    }

    public void agregarEmpleado(Empleado nuevo)
    {
        empleados.add(nuevo);
    }

    public String regresaNombre()
    {
        return nombre;
    }
    
    public ArrayList<Empleado> regresaEmpleados()
    {
        return empleados;
    }

    public void añadirMesas(int cant)
    {
        int tam = mesas.size();
        for (int i = tam + 1; i < tam +cant +1; i++)
        {
            mesas.add(new Mesa(5, i));
        }
    }

    public Menu regresaMenu() {
        return menu;
    }

}

