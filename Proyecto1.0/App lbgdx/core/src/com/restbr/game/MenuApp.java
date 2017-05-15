package com.restbr.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.ArrayList;

/**
 * Created by lucerogarcia on 08/05/17.
 */
public class MenuApp {
    private ArrayList <Boton> botones;

    public MenuApp()
    {
        botones = new ArrayList<Boton>();
    }

    public void addButton(int x,int y, String cadena)
    {
        Boton b = new Boton(x, y, cadena );
        botones.add(b);
    }

    public void dibujaMenu(ShapeRenderer shpr, SpriteBatch batch)
    {
        for(Boton b : botones )
        {
            b.dibujaBoton(shpr,batch);
        }
    }

}
