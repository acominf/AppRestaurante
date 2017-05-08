package com.restbr.game;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by lucerogarcia on 29/04/17.
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

    public void eliminarPlatillo(String nom)
    {
        Platillo temp;
        Iterator <Platillo> it = menu.iterator();
        while(it.hasNext())
        {
            temp = it.next();
            if(temp.accederNombre()==nom)
            {
                it.remove();
            }
        }

    }
}
