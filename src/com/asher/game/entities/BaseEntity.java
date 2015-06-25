package com.asher.game.entities;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Point;

public abstract class BaseEntity {
	protected Point position;
	protected int width;
	protected int height;
	protected double rotation;
	
	public BaseEntity() {
		this.position = new Point(0, 0);
		this.width = 0;
		this.height = 0;
		this.rotation = 0;
		
	}
	
	public BaseEntity(Point posistion) {
		this.position = posistion;
		this.width = 0;
		this.height = 0;
		this.rotation = 0;
		
	}
	
	public BaseEntity(Point posistion, int width, int height, double rotation) {
		this.position = posistion;
		this.width = width;
		this.height = height;
		this.rotation = rotation;
		
	}
	
	public abstract void update(GameContainer gc, int i) throws SlickException;
	
	public abstract void render(GameContainer container, Graphics g) throws SlickException;
	
}
