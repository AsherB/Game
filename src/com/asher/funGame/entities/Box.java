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
	private int xVelocity = 0;
	private int yVelocity = 0;
	private int speed = 0;
	public Box(int zIndex, int x, int y, int width, int height) {
		super(zIndex);
		box = new Rectangle(x, y, width, height);
		this.zIndex = zIndex;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.xVelocity = xVelocity;
		this.yVelocity = yVelocity;
		this.speed = speed;
		
	}
	
	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		 Input in = container.getInput();
		if (in.isKeyDown(Input.KEY_RIGHT)) {
			box.setX(box.getX() + xVelocity * speed + 3);
		}
		if (in.isKeyDown(Input.KEY_LEFT)) {
			box.setX(box.getX() + xVelocity * speed - 3);
		}
		if (in.isKeyDown(Input.KEY_DOWN)) {
			box.setY(box.getY() + yVelocity * speed + 3);
		}
		if (in.isKeyDown(Input.KEY_UP)) {
			box.setY(box.getY() + yVelocity * speed - 3);
		}
		if (box.getX() > 1920) {
			box.setX(1920);
		}
		if (box.getY() > 1080) {
			box.setY(1080);
		}
		if (box.getX() < 0) {
			box.setX(1920);
		}
		if (box.getY() < 0) {
			box.setY(1080);
		}
		if (in.isKeyPressed(Input.KEY_SPACE)) {
			
		}
		
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		g.setColor(Color.red);
		g.fill(box);
	}

}
