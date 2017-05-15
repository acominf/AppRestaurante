package com.restbr.game;

import java.util.ArrayList;

/**
 * Created by lucerogarcia on 29/04/17.
 */
public class Pedido {
    private ArrayList<Platillo> orden;
    private  boolean estaListo;
    private ArrayList<String>  notas;

    public Pedido()
    {
        orden = new ArrayList<Platillo>();
        notas = new ArrayList<String>();
        estaListo = false;
    }

    public void agregarPlatillo(Platillo pl)
    {
        orden.add(pl);
        notas.add("");
    }

    public int buscarIndice(String nom)
    {
        int i;
        for(i=0;i<orden.size();i++)
        {
            if(orden.get(i).accederNombre()==nom)
            {
                return i;
            }
        }
        return -1;
    }

    public void agregarNota(String platillo, String nota)
    {
        int i = buscarIndice(platillo);
        notas.set(i,nota);
    }

    public boolean isReady()
    {
        return estaListo;
    }

    public void marcarListo()
    {
        estaListo = true;
    }
}

