package com.restbr.game;

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
        coordX = 25;
        coordY = 25;
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
