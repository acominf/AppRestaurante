package com.restbr.game;
import java.util.ArrayList;

/**
 * Created by lucerogarcia on 29/04/17.
 */
public class Pedido {
    private ArrayList<Platillo> orden;
    private  boolean estaListo;
    private String nota;

    public Pedido()
    {
        orden = new ArrayList<Platillo>();
        estaListo = false;
    }

    public void agregarPlatillo(Platillo pl)
    {
        orden.add(pl);
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
