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

public class Bullet extends BaseEntity implements Collidable{
	private Circle bullet;
	Random r = new Random();
	private int xVelocity = 0;
	private int yVelocity = 0;
	private int speed = 0;
	int y;
	int x;
	public Bullet(int zIndex, int x, int y, int width, int height) {
		super(zIndex);
		y = r.nextInt(1030);
		x = r.nextInt(1900);
		width = r.nextInt(40);
		height = r.nextInt(40);
		width = height;
		bullet = new Circle(x, y, width, height);
		this.zIndex = zIndex;
		CollisionSystem.getInstance().register(this);
		addEventListener("CollisionEvent", new EventHandler() {

			@Override
			public void handleEvent(Event e) {
				
				
				
				
				bullet.setX(bullet.getX() + xVelocity * speed - 3);
			}
			
		});
		
		
		
	}

	@Override
	public void update(GameContainer container, int delta)
			throws SlickException {
		bullet.setX(bullet.getX() + xVelocity * speed + 10);
		
		
		if (bullet.getX() > 1915) {
			bullet.setX(0);
		}
		if (bullet.getY() > 1075) {
			bullet.setY(0);
		}
		if (bullet.getX() < 0) {
			bullet.setX(1915);
		}
		if (bullet.getY() < 0) {
			bullet.setY(0);
		}
		if (bullet.getY() < 30) {
			bullet.setY(30);
		}
		if (bullet.getY() > 1060) {
			bullet.setY(1060);
		}
	}

	@Override
	public void render(GameContainer container, Graphics g)
			throws SlickException {
		g.setColor(Color.gray);
		g.fill(bullet);
		
	}

	@Override
	public Shape getCollisionBouds() {
		// TODO Auto-generated method stub
		return bullet;
	}

	@Override
	public boolean collidesWith(Collidable c) {
		// TODO Auto-generated method stub
		return bullet.intersects(c.getCollisionBouds());
	}

}
