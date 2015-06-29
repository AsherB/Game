package com.asher.funGame.entities;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;


public class Player extends BaseEntity {
	private Rectangle player;
	 
	
	public Player(int zIndex, int x, int y, int width, int height) {
		super(zIndex);
		player = new Rectangle(x, y, width, height);
		
		
	}

	@Override
	public void update(GameContainer container, int delta)
			throws SlickException {
		

	}

	@Override
	public void render(GameContainer container, Graphics g)
			throws SlickException {
		g.setColor(Color.green);
		g.fill(player);
		
	}

}
