package com.restbr.game;

import java.util.ArrayList;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import java.util.Scanner;

/**
 * Created by lucerogarcia on 29/04/17.
 */
public class Restaurante
{
    private String nombre;
    private String direccion;
    private String telefono;
    private String horario; //quizás cambie
    private ArrayList<Empleado> empleados;
    private ArrayList<Mesa> mesas;
    private Menu menu;
    private int cantSeccion;

    public Restaurante(String nom, String dir, String tel, String hor, int cantSec)
    {
        nombre = nom;
        direccion = dir;
        telefono = tel;
        horario = hor;
        empleados = new ArrayList<Empleado>();
        mesas = new ArrayList<Mesa>();
        cantSeccion = cantSec;
    }

    public ArrayList mesasRes()
    {
        return mesas;
    }

    public void agregarEmpleado(Empleado nuevo)
    {
        empleados.add(nuevo);
    }

    public String regresaNombre()
    {
        return nombre;
    }

    public void dibujarMesas(ShapeRenderer shpr, SpriteBatch batch)
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

    public void añadirMesas(int cant, int numSecc)
    {
        int tam = mesas.size();
        for (int i = tam + 1; i < tam +cant +1; i++)
        {
            mesas.add(new Mesa(5, i, numSecc) );
        }
    }
}
