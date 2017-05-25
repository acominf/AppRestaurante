package com.restbr.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import java.awt.TextField;
import java.util.ArrayList;

import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle;

import static javax.swing.SwingConstants.*;


public class AppRestaurante extends Game{
	SpriteBatch batch;
	ShapeRenderer shapeRenderer;
	DiagramaMesas croquis;
	MenuPrincipal menuPrincipal;
	Escuchador aux;
	Pantalla current;
	ArrayList<Usuario> usuarios;
	TextField textField;
    private int p;
    private int mouseX;
    private int mouseY;


	class Escuchador implements Input.TextInputListener{
		private String entrada;

		public Escuchador() {
			entrada = "";
		}

		public String obtenerIn() {
			return entrada;
		}

		@Override
		public void input(String text) {
			entrada = text;
		}
		@Override
		public void canceled() {
		}
	}

	@Override
	public void create () {
		batch = new SpriteBatch();
		shapeRenderer = new ShapeRenderer();
		//croquis = new DiagramaMesas(this);
		menuPrincipal = new MenuPrincipal(this);
		aux = new Escuchador();
		TextFieldStyle textFieldStyle = new TextFieldStyle();

		usuarios = new ArrayList<Usuario>();
		usuarios.add( new Usuario("Mayra", "holi@GGmail.com") );
		usuarios.get(0).crearRestaurante(new Restaurante("Tortas chidas", "una de por ahi", "444nomeacuerdo:C", "12:00 - 19:00", 1) );
		usuarios.get(0).buscarRestaurante("Tortas chidas").añadirMesas(20, 1);
		current = menuPrincipal;
		this.setScreen(current);
		p = 0;
		mouseX = 0;
		mouseY = 0;
	}

	@Override
	public void render () {
		super.render();
		if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
		    mouseX = Gdx.input.getX();
		    mouseY = Gdx.graphics.getHeight() - Gdx.input.getY();


			if(p==1)
			{
				croquis = new DiagramaMesas(this, usuarios.get(0).buscarRestaurante("Tortas chidas").mesasRes());
				current = croquis;
				this.setScreen(croquis);
				mouseX =0;
				mouseY = 0;
			}
			/*if(this.getScreen() == menuPrincipal) {
				this.setScreen(croquis);
				Gdx.input.getTextInput(aux, "Buscar", "", "Nombre del restaurante");
			}*/
		}
		else {
			if (Gdx.input.isButtonPressed(Input.Buttons.RIGHT)) {
				this.setScreen(menuPrincipal);
			}
		}
		p=current.interactua(mouseX, mouseY);
	}


	@Override
	public void dispose ()
	{
		batch.dispose();
	}


}
