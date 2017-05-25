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
    ArrayList<Mesa> mesas;
    ShapeRenderer shapeRenderer;
    private Texture texture;
    private Sprite imagen;
    private boolean bandera;
    private int ix;
    private int iy;


    public DiagramaMesas(final AppRestaurante game, ArrayList<Mesa> mesas) {
        this.game = game;
        this.mesas = mesas;
        texture = new Texture("OpcionesMesa.jpg");
        imagen = new Sprite(texture);
        bandera =false;
        shapeRenderer = new ShapeRenderer();
        ix=0;
        iy=0;
    }


    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        shapeRenderer.setAutoShapeType(true);
        shapeRenderer.begin();
        shapeRenderer.setColor(0, 1, 0, 1);
        Utilidad.dibujarMesas(shapeRenderer, game.batch,mesas);
        shapeRenderer.end();
        game.batch.end();
    }

    public int interactua(int xm,int ym)
    {
        int b=0;
        for(Mesa m : mesas)
        {
            int xMesa = m.accederX();
            int yMesa = m.accederY();
            if(bandera )
            {

                game.batch.begin();
                imagen.setPosition(ix, iy);//se imprime la imagen del menu de mesa
                imagen.draw(game.batch);
                game.batch.end();
                if(ix+25<=xm && ix+75>=xm && iy+25<=ym && iy+75>=ym)//ix, iy siendo las coordenadas donde empieza la imagen
                {
                    System.out.println("Soy el +");
                    return 2;
                }
                else if(ix+100<=xm && ix+150>=xm && iy+25<=ym && iy+75>=ym)//boton -
                {
                    System.out.println("Soy el -");
                    bandera = false;
                }
                else if(ix+175<=xm && ix+225>=xm && iy+25<=ym && iy+75>=ym)//boton lista
                {
                    System.out.println("Soy la lista");
                    bandera = false;
                }
            }
            else if(xMesa-25 <=xm && xMesa+25>=xm && yMesa-25<=ym && yMesa+25>=ym)
            {
                ix = xMesa + 40;
                iy = yMesa -130;
                bandera=true;
            }
            else
            {
                bandera = false;
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
