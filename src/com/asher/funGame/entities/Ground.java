package com.asher.funGame.entities;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

import com.asher.funGame.collision.Collidable;
import com.asher.funGame.collision.CollisionSystem;

public class Ground extends BaseEntity implements Collidable{
	private Rectangle ground;
	 
	
	public Ground(int zIndex, int x, int y, int width, int height) {
		super(zIndex);
		ground = new Rectangle(x, y, 1920, 50);
		CollisionSystem.getInstance().register(this);
		
	}

	@Override
	public void update(GameContainer container, int delta)
			throws SlickException {
		

	}

	@Override
	public void render(GameContainer container, Graphics g)
			throws SlickException {
		g.setColor(Color.green);
		g.fill(ground);
		
	}

	@Override
	public Shape getCollisionBouds() {
		// TODO Auto-generated method stub
		return ground;
	}

	@Override
	public boolean collidesWith(Collidable c) {
		// TODO Auto-generated method stub
		return ground.intersects(c.getCollisionBouds());
	}

}
