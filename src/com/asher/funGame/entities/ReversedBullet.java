package com.asher.funGame.entities;

import java.util.Random;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Shape;

import com.asher.funGame.collision.Collidable;
import com.asher.funGame.collision.CollisionSystem;
import com.asher.funGame.events.Event;
import com.asher.funGame.events.EventHandler;

public class ReversedBullet extends BaseEntity implements Collidable{
	Random r = new Random();
	private Circle rbullet;
	private int xVelocity = 0;
	private int yVelocity = 0;
	private int speed = 0;
	
	public ReversedBullet(int zIndex, int x, int y, int width, int height) {
		super(zIndex);
		y = r.nextInt(1030);
		x = r.nextInt(1900);
		rbullet = new Circle(x, y, width, height);
		this.zIndex = zIndex;
		CollisionSystem.getInstance().register(this);
		addEventListener("CollisionEvent", new EventHandler() {

			@Override
			public void handleEvent(Event e) {
				
				
				rbullet.setY(rbullet.getY() + yVelocity * speed - 3);
				rbullet.setY(rbullet.getY() + yVelocity * speed + 3);
				rbullet.setX(rbullet.getX() + xVelocity * speed - 3);
				rbullet.setX(rbullet.getX() + xVelocity * speed + 3);
			}
			
		});
		
		
	}

	@Override
	public void update(GameContainer container, int delta)
			throws SlickException {
		rbullet.setX(rbullet.getX() + xVelocity * speed - 10);
		
		
		if (rbullet.getX() > 1915) {
			rbullet.setX(0);
		}
		if (rbullet.getY() > 1075) {
			rbullet.setY(0);
		}
		if (rbullet.getX() < 0) {
			rbullet.setX(1915);
		}
		if (rbullet.getY() < 0) {
			rbullet.setY(0);
		}
	}

	@Override
	public void render(GameContainer container, Graphics g)
			throws SlickException {
		g.setColor(Color.gray);
		g.fill(rbullet);
		
	}

	@Override
	public Shape getCollisionBouds() {
		// TODO Auto-generated method stub
		return rbullet;
	}

	@Override
	public boolean collidesWith(Collidable c) {
		// TODO Auto-generated method stub
		return rbullet.intersects(c.getCollisionBouds());
	}

}
