package com.restbr.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.*;

import java.awt.*;

/**
 * Created by lucerogarcia on 09/05/17.
 */
public class MenuPrincipal implements Screen {
    final AppRestaurante game;
    MenuApp menuApp;
    ShapeRenderer shapeRenderer;

    public MenuPrincipal(final AppRestaurante game)
    {
        this.game = game;
        menuApp = new MenuApp();
        menuApp.addButton(20,300,"holi");
        menuApp.addButton(20,260,"crayoli");
        menuApp.addButton(20,220,"holi de nuevo");
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


}
