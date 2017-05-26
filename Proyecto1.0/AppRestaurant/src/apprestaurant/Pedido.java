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
public class Pedido {
    private ArrayList<Platillo> orden;
    private  boolean estaListo;
    private ArrayList<String>  notas;
    private ArrayList<Integer>  cantidad;

    public Pedido()
    {
        orden = new ArrayList<Platillo>();
        notas = new ArrayList<String>();
        cantidad = new ArrayList<Integer>();
        estaListo = false;
    }

    public void agregarPlatillo(Platillo pl, String n,int c)
    {
        for(int i = 0;i<c;i++)
        {
            orden.add(pl);
            notas.add("");
            cantidad.add(c);
        }
    }

    public void eliminarPlatillo(int i)
    {
        notas.remove(i);
        cantidad.remove(i);
        orden.remove(i);
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


