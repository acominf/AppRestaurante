/*package com.restbr.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import java.util.ArrayList;
import com.badlogic.gdx.graphics.g2d.BitmapFont;


public class MyGdxGameApp extends Game{
	SpriteBatch batch;
	ShapeRenderer shapeRenderer;
	ArrayList<Usuario> usuarios;
	BitmapFont font;
    MenuApp Menu;

	@Override
	public void create () {
		batch = new SpriteBatch();
		shapeRenderer = new ShapeRenderer();
		this.setScreen(new DiagramaMesas(this));
		/*usuarios = new ArrayList<Usuario>();
		usuarios.add( new Usuario("Mayra", "holi@GGmail.com") );
		usuarios.get(0).crearRestaurante(new Restaurante("Tortas chidas", "una de por ahi", "444nomeacuerdo:C", "12:00 - 19:00", 1) );
		usuarios.get(0).buscarRestaurante("Tortas chidas").añadirMesas(2, 1);
        Menu = new MenuApp();
        Menu.addButton(20,300,"holi");
        Menu.addButton(20,260,"crayoli");
        Menu.addButton(20,220,"holi de nuevo");*/
/*	}

	@Override
	public void render () {
		/*Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		shapeRenderer.setAutoShapeType(true);
		shapeRenderer.begin();
		shapeRenderer.setColor(0, 1, 0, 1);
        Menu.dibujaMenu(shapeRenderer, batch);
		usuarios.get(0).buscarRestaurante("Tortas chidas").dibujarMesas(shapeRenderer, batch);
		shapeRenderer.end();
		batch.end();*//*
		super.render();
	}

	@Override
	public void dispose () {
		batch.dispose();
		//font.dispose();
	}



}*/