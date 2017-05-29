/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apprestaurant;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
/**
 *
 * @author lucerogarcia
 */
public class Restaurante implements Serializable
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
    
    public ArrayList<Pedido> regresaPedidos()
    {
        ArrayList <Pedido> pedidos = new ArrayList <Pedido>();
        for(int i = 0 ; i<mesas.size();i++)
        {
            Pedido p;
            p=mesas.get(i).accederPedido();
            pedidos.add(p);
        }
        return pedidos;
    }
    
    public void agregarEmpleado(Empleado nuevo)
    {
        empleados.add(nuevo);
    }

    public String accedeNombre()
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

    public String accedeDireccion() {
        return direccion;
    }

    public String accedeTelefono() {
        return telefono;
    }

    public String accedeHi() {
        return horarioInicio;
    }

    public String accedeHf() {
        return horarioFin;
    }

    public void modificarNombre(String nom) {
        nombre = nom;
    }

    public void modificarDireccion(String tel) {
        telefono = tel;
    }

    public void modificarTelefono(String dir) {
        direccion = dir;
    }

    public void modificarHi(String h1) {
        horarioInicio = h1;
    }

    public void modificarHf(String h2) {
        horarioFin = h2;
    }


}

