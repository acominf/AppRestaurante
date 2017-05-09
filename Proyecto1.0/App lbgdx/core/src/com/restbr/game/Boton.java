package com.restbr.game;

import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.awt.*;

/**
 * Created by lucerogarcia on 08/05/17.
 */
public class Boton {
    private int x;
    private int y;
    private String cadena;

    public Boton(int cx,int cy, String c )
    {
        x=cx;
        y=cy;
        cadena=c;
    }

    public void dibujaBoton(ShapeRenderer shpr, SpriteBatch batch)
    {
        shpr.setColor(Color.BLACK);
        BitmapFont bitmapFont = new BitmapFont();
        bitmapFont.setColor(0,0,1,0);
        shpr.rect((float)x, (float)y, 80,40);
        bitmapFont.draw(batch,cadena,(float)x, (float)y );
    }
}