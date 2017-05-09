package com.restbr.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import java.util.ArrayList;


public class AppRestaurante extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	ShapeRenderer shapeRenderer;
	ArrayList<Usuario> usuarios;
	MenuApp Menu;

	@Override
	public void create() {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		shapeRenderer = new ShapeRenderer();
		usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario("Mayra", "holi@GGmail.com"));
		usuarios.get(0).crearRestaurante(new Restaurante("Tortas chidas", "una de por ahi", "444nomeacuerdo:C", "12:00 - 19:00", 1));
		usuarios.get(0).buscarRestaurante("Tortas chidas").añadirMesas(2, 1);
		Menu = new MenuApp();
		Menu.addButton(20, 300, "holi");
		Menu.addButton(20, 260, "crayoli");
		Menu.addButton(20, 220, "holi de nuevo");
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		//batch.draw(img, 0, 0);
		shapeRenderer.setAutoShapeType(true);
		shapeRenderer.begin();
		shapeRenderer.setColor(0, 1, 0, 0);
		Menu.dibujaMenu(shapeRenderer, batch);
		//shapeRenderer.line(50, 80, 100, 140);
		usuarios.get(0).buscarRestaurante("Tortas chidas").dibujarMesas(shapeRenderer, batch);
		shapeRenderer.end();
		batch.end();
	}

	@Override
	public void dispose() {
		batch.dispose();
		img.dispose();
	}
}