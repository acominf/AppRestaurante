package com.restbr.game;

/**
 * Created by lucerogarcia on 09/05/17.
 */
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.ArrayList;


public class DiagramaMesas implements Pantalla{

    final AppRestaurante game;
    ArrayList<Usuario> usuarios;
    ShapeRenderer shapeRenderer;
    private Texture texture;
    private Sprite imagen;


    public DiagramaMesas(final AppRestaurante game) {
        this.game = game;
        usuarios = new ArrayList<Usuario>();
        shapeRenderer = new ShapeRenderer();
        usuarios.add( new Usuario("Mayra", "holi@GGmail.com") );
        usuarios.get(0).crearRestaurante(new Restaurante("Tortas chidas", "una de por ahi", "444nomeacuerdo:C", "12:00 - 19:00", 1) );
        usuarios.get(0).buscarRestaurante("Tortas chidas").añadirMesas(20, 1);
        texture = new Texture("OpcionesMesa.jpg");
        imagen = new Sprite(texture);
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
        int b=0;
        ArrayList <Mesa> mesas = usuarios.get(0).buscarRestaurante("Tortas chidas").mesasRes();
        for(Mesa m : mesas)
        {
            int xMesa = m.accederX();
            int yMesa = m.accederY();

            if(xMesa-25 <=xm && xMesa+25>=xm && yMesa-25<=ym && yMesa+25>=ym)
            {
                game.batch.begin();
                imagen.setPosition(xMesa + 40, yMesa - 130);//se imprime la imagen del menu de mesa
                imagen.draw(game.batch);
                game.batch.end();


                //para el boton de más
                /*if(ix+25<=xm && ix+75>=xm && iy+95<=ym && iy+145>=ym)//ix, iy siendo las coordenadas donde empieza la imagen
                {

                }
                else if(ix+100<=xm && ix+150>=xm && iy+95<=ym && iy+145>=ym)//boton -
                {

                }
                else if(ix+175<=xm && ix+225>=xm && iy+95<=ym && iy+145>=ym)//boton lista
                {

                }*/
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
        texture.dispose();
    }


}
