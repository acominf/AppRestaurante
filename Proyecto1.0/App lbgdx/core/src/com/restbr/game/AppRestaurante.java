package com.restbr.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import java.awt.TextField;
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
	TextField textField;
    private int p;


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
		croquis = new DiagramaMesas(this);
		menuPrincipal = new MenuPrincipal(this);
		aux = new Escuchador();
		TextFieldStyle textFieldStyle = new TextFieldStyle();
		current = menuPrincipal;
		this.setScreen(current);
		p = 0;
	}

	@Override
	public void render () {
		super.render();
		if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
		    int mouseX = Gdx.input.getX();
		    int mouseY = Gdx.graphics.getHeight() - Gdx.input.getY();

            p=current.interactua(mouseX, mouseY);
			if(p==1)
			{
				current = croquis;
				this.setScreen(croquis);
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
	}


	@Override
	public void dispose ()
	{
		batch.dispose();
	}


}
