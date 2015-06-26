package com.asher.funGame.entities;

import java.awt.Container;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;

public class Pirate1<speed> extends BaseEntity {

	private Rectangle pirate1;
	private Image texture;
	private int speed = 1;
	private int xVelocity = 1;
	private int yVelocity = 1;
	
	public Pirate1(int zIndex, int x, int y, int width, int height) {
		super(zIndex);
		
		pirate1 = new Rectangle(x, y, width, height);
		
		try {
			texture = new Image("assets/pirate_penguin.png");
		} catch (SlickException e) {
			e.printStackTrace();
		}
		
	}

	
	
	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		container.getInput().isKeyDown(Input.KEY_NUMPAD6);
		
	}

	@Override
	public void render(GameContainer container, Graphics g)
			throws SlickException {
		g.drawImage(texture, pirate1.getX(), pirate1.getY());
		
	}}
