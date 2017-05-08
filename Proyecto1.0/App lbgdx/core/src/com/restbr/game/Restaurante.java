package com.restbr.game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.ArrayList;
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
        /*No me termine de convencer y lo deje en comentarios jeje
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre: ");
        nombre = sc.nextLine();
        System.out.println("dirección: ");
        direccion = sc.nextLine();
        System.out.println("Telefono: ");
        telefono = sc.nextLine();
        System.out.println("Horario: ");
        horario = sc.nextLine();*/
        nombre = nom;
        direccion = dir;
        telefono = tel;
        horario = hor;
        empleados = new ArrayList<Empleado>();
        mesas = new ArrayList<Mesa>();
        cantSeccion = cantSec;
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
        bitmapFont.setColor(0,0,1,0);
        for(Mesa m: mesas)
        {
            shpr.circle((float)m.accederX(), (float)m.accederY(), 20);
            bitmapFont.draw(batch, ""+m.accederId(), (float)m.accederX(), (float)m.accederY() );
        }
    }

    public void añadirMesas(int cant, int numSecc)
    {
        int tam = mesas.size();
        for (int i = tam +1; i < tam +cant; i++)
        {
            mesas.add( new Mesa(5, i, numSecc) );
        }
    }
}