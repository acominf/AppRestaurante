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
        coordY = 50+(75*((id%5)+1));
        coordX = 50+60*((id-1)/5);

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