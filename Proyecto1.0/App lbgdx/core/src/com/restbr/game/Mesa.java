package com.restbr.game;

import com.badlogic.gdx.Gdx;

/**
 * Created by lucerogarcia on 29/04/17.
 */
public class Mesa
{
    private Pedido pedido;
    private int capacidad;
    private int identificador;
    private Boolean estaOcupada;
    private int coordX;
    private int coordY;
    private int seccion;
    private int c;

    /**
     *
     * @param cap capacidad de la mesa
     * @param id identificador de la mesa
     */
    public Mesa(int cap, int id, int seccion)
    {
        capacidad=cap;
        identificador=id;
        estaOcupada = false;
        if(id<=5)
        {
            coordY = 50+(75*id);
            coordX = 50;
        }
        else if(id<=10)
        {
            coordY = 50+(75*(id-5));
            coordX = 110;
        }else if(id<=15)
        {
            coordY = 50+(75*(id-10));
            coordX = 170;
        }else if(id<=20)
        {
            coordY = 50+(75*(id-15));
            coordX = 230;

        }



        //System.out.println(" coordX "+ coordX+ " coordY= "+coordY);
        this.seccion = seccion;

    }

    public int accessid()
    {
        return identificador;
    }

    public void agregarPedido(Pedido p)
    {
        pedido = p;
    }

    public Pedido accederPedido(){ return pedido; }

    public int accederX() { return coordX;
    }

    public int accederY() { return coordY;
    }

    public int accederId() { return identificador;
    }
}