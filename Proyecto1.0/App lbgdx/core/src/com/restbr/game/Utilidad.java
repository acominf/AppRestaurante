package com.restbr.game;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.ArrayList;

/**
 * Created by lucerogarcia on 24/05/17.
 */
public class Utilidad {

    public static void dibujarMesas(ShapeRenderer shpr, SpriteBatch batch, ArrayList<Mesa> mesas)
    {
        BitmapFont bitmapFont = new BitmapFont();
        bitmapFont.setColor(0,0,1,1);
        String s;
        for(Mesa m: mesas)
        {
            shpr.circle((float)m.accederX(), (float)m.accederY(), 20);
            //System.out.println("mesa"+m.accederId()+" x= "+(float)m.accederX()+" y= "+ (float)m.accederY());
            s=""+m.accederId();
            bitmapFont.draw(batch, s , (float)m.accederX(), (float)m.accederY() );
        }
    }


}
