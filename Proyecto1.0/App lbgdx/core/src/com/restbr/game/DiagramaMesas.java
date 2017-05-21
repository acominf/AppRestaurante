package com.restbr.game;

/**
 * Created by lucerogarcia on 09/05/17.
 */
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.ArrayList;


public class DiagramaMesas implements Pantalla{

    final AppRestaurante game;
    ArrayList<Usuario> usuarios;
    ShapeRenderer shapeRenderer;


    public DiagramaMesas(final AppRestaurante game) {
        this.game = game;
        usuarios = new ArrayList<Usuario>();
        shapeRenderer = new ShapeRenderer();
        usuarios.add( new Usuario("Mayra", "holi@GGmail.com") );
        usuarios.get(0).crearRestaurante(new Restaurante("Tortas chidas", "una de por ahi", "444nomeacuerdo:C", "12:00 - 19:00", 1) );
        usuarios.get(0).buscarRestaurante("Tortas chidas").añadirMesas(20, 1);

    }


    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        shapeRenderer.setAutoShapeType(true);
        shapeRenderer.begin();
        shapeRenderer.setColor(0, 1, 0, 1);
        usuarios.get(0).buscarRestaurante("Tortas chidas").dibujarMesas(shapeRenderer, game.batch);
        shapeRenderer.end();
        game.batch.end();
    }

    public int interactua(int xm,int ym)
    {
        ArrayList <Mesa> mesas = new ArrayList<Mesa>();
        for(Mesa m : mesas)
        {
            if(m.accederX()<=xm && m.accederX()+25>=xm && m.accederY()<=ym && m.accederY()+25>=ym)
            {
                //aqui vamos a imprimir una imagen
            }
            else
            {
                //if()//coordenadas del boton de regresar
            }
        }
        return 0;
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void dispose() {

    }


}
