package com.asher.funGame.entities;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;

public class Box extends BaseEntity{

	private Rectangle box;
	private int x = 0;
	private int y = 0;
	private int width = 0;
	private int height = 0;
	
	public Box(int zIndex, int x, int y, int width, int height) {
		super(zIndex);
		box = new Rectangle(x, y, width, height);
		this.zIndex = zIndex;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}
	
	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		
		if (container.getInput().isKeyPressed(Input.KEY_RIGHT)) {
			x = x + 3;
		}
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		g.setColor(Color.blue);
		g.fill(box);
	}

}
