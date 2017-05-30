/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apprestaurant;

import java.io.Serializable;

public class Mesa implements Serializable
{
    private Pedido pedido;
    private int capacidad;
    private int identificador;
    private Boolean estaOcupada;
    private int coordX;
    private int coordY;

    /**
     *
     * @param cap capacidad de la mesa
     * @param id identificador de la mesa
     * @param seccion
     */
    public Mesa(int cap, int id)
    {
        pedido = new Pedido();
        capacidad=cap;
        identificador=id;
        estaOcupada = false;
        coordY = 50+50*((id-1)%5);
        coordX = 70+70*((id-1)/5);
    }

    public int accessid()
    {
        return identificador;
    }

    public void agregarPedido(Pedido p)
    {
        pedido = p;
    }

    public Pedido accederPedido()
    { 
        return pedido; 
    }

    public int accederX() { return coordX;
    }

    public int accederY() { return coordY;
    }

    public int accederId() { return identificador;
    }
}
