package com.asher.funGame.entities;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Circle;

public class Bullet extends BaseEntity{
	private Circle bullet;
	private int xVelocity = 0;
	private int yVelocity = 0;
	private int speed = 0;
	private int x = 0;
	private int y = 0;
	public Bullet(int zIndex, int x, int y, int width, int height) {
		super(zIndex);
		bullet = new Circle(x, y, 5, 5);
		this.zIndex = zIndex;
		
		
	}

	@Override
	public void update(GameContainer container, int delta)
			throws SlickException {
		if (x < 0) {
			
		}

	}

	@Override
	public void render(GameContainer container, Graphics g)
			throws SlickException {
		g.setColor(Color.gray);
		g.fill(bullet);

	}

}
