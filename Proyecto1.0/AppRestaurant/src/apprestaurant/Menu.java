/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apprestaurant;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author lucerogarcia
 */
public class Menu {
    private ArrayList<Platillo> menu;

    public Menu()
    {
        menu = new ArrayList<Platillo>();
    }

    public void agregarPlatillo(Platillo nuevo)
    {
        menu.add(nuevo);
    }
    
    public void agregarPlatillo(int i, Platillo nuevo)
    {
        menu.add(i, nuevo);
    }

    public void eliminarPlatillo(String nom)
    {
        Platillo temp;
        Iterator <Platillo> it = menu.iterator();
        while(it.hasNext())
        {
            temp = it.next();
            if(temp.accederNombre().equals(nom))
            {
                it.remove();
            }
        }
    }
    
    public void eliminarPlatillo(int indice)
    {
        menu.remove(indice);
        
    }
    
    public Platillo regresaPlatillo(int i)
    {
        return menu.get(i);
    }
    
    public ArrayList<Platillo> regresaPlatillos()
    {
        return menu;
    }
}