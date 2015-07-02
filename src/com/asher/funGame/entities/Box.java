package com.asher.funGame.entities;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

import com.asher.funGame.EntityManager;
import com.asher.funGame.collision.Collidable;
import com.asher.funGame.collision.CollisionSystem;
import com.asher.funGame.events.Event;
import com.asher.funGame.events.EventHandler;

public class Box extends BaseEntity implements Collidable{
	boolean isDead;
	private Rectangle box;
	private int xVelocity = 0;
	private int yVelocity = 0;
	private int speed = 0;
	
	public Box(int zIndex, int x, int y, int width, int height) {
		super(zIndex);
		box = new Rectangle(x, y, 25, 25);
		this.zIndex = zIndex;
		CollisionSystem.getInstance().register(this);
		isDead = false;
		
		addEventListener("CollisionEvent", new EventHandler() {
			
			@Override
			public void handleEvent(Event e) {
				
				if (isDead = true) {
					System.out.println("DEAD");
					
				}
				
			}
			
		});
		
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
		if (box.getX() > 1895) {
			box.setX(1895);
		}
		if (box.getY() > 1055) {
			box.setY(1055);
		}
		if (box.getX() < 0) {
			box.setX(0);
		}
		if (box.getY() < 0) {
			box.setY(0);
		}
		if (isDead == true) {
			box.setX(500);
			box.setY(1050);
		}
		if (box.getX() == 500) {
			isDead = false;
		}
		
	}
	
	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		if (isDead == false) {
		g.setColor(Color.red);
		g.fill(box);
		g.drawString("Player 1", box.getX() - 19, box.getY() - 20);
		}
		if (box.getY() == 0) {
			g.drawString("YOU MADE IT!", 910, 540);
			
		
		}
	}

	@Override
	public Shape getCollisionBouds() {
		return box;
	}

	@Override
	public boolean collidesWith(Collidable c) {
		return box.intersects(c.getCollisionBouds());
	}

}
