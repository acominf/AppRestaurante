package com.restbr.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.*;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by lucerogarcia on 09/05/17.
 */
public class MenuPrincipal implements Pantalla { // Screen
    final AppRestaurante game;
    MenuApp menuApp;
    ShapeRenderer shapeRenderer;

    public MenuPrincipal(final AppRestaurante game)
    {
        this.game = game;
        menuApp = new MenuApp();
        menuApp.addButton(20,300,"Croquis");
        menuApp.addButton(20,260,"Restaurant");
        menuApp.addButton(20,220,"Restaurante 2");
        shapeRenderer = new ShapeRenderer();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        shapeRenderer.setAutoShapeType(true);
        shapeRenderer.begin();
        shapeRenderer.setColor(0, 1, 0, 1);
        menuApp.dibujaMenu(shapeRenderer, game.batch);
        TextField txtUsername = new TextField("");
        txtUsername.setText("test");
        txtUsername.setLocation(30, 30);
        shapeRenderer.end();
        game.batch.end();
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

    public int coordenadasX()
    {
        int x = Gdx.input.getX();
        return x;
    }

    public int coordenadasY()
    {
        int y = Gdx.input.getY();
        return y;
    }

    @Override
    public int interactua(int xm,int ym)
    {
        ArrayList <Boton> boton = new ArrayList<Boton>();
        boton = menuApp.accederBotones();
        for(Boton b : boton)
        {
            if(xm>=b.getX() && xm<=b.getX()+80 && ym>=b.getY() && ym<=b.getY()+40)
            {
                if(b.getCadena()=="Croquis")
                {
                    return 1;
                }
            }
        }
        return 0;
    }
}
