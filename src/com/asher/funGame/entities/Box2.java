package com.asher.funGame.entities;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;
import com.asher.funGame.collision.Collidable;
import com.asher.funGame.collision.CollisionSystem;
import com.asher.funGame.events.Event;
import com.asher.funGame.events.EventHandler;

public class Box2 extends BaseEntity implements Collidable{
	boolean isDead;
	
	private Rectangle box2;
	private int xVelocity = 0;
	private int yVelocity = 0;
	private int speed = 0;
	public Box2(int zIndex, int x, int y, int width, int height) {
		super(zIndex);
		box2 = new Rectangle(x, y, 25, 25);
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
		if (in.isKeyDown(Input.KEY_D)) {
			box2.setX(box2.getX() + xVelocity * speed + 3);
		}
		if (in.isKeyDown(Input.KEY_A)) {
			box2.setX(box2.getX() + xVelocity * speed - 3);
		}
		if (in.isKeyDown(Input.KEY_S)) {
			box2.setY(box2.getY() + yVelocity * speed + 3);
		}
		if (in.isKeyDown(Input.KEY_W)) {
			box2.setY(box2.getY() + yVelocity * speed - 3);
		}
		if (box2.getX() > 1895) {
			box2.setX(1895);
		}
		if (box2.getY() > 1055) {
			box2.setY(1055);
		}
		if (box2.getX() < 0) {
			box2.setX(0);
		}
		if (box2.getY() < 0) {
			box2.setY(0);
		}
		if (isDead == true) {
			box2.setX(400);
			box2.setY(1050);
		}
		if (box2.getX() == 400) {
			isDead = false;
		}
					
				
			
		
	}
	
	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		
		if (isDead == false) {
		g.setColor(Color.blue);
		g.fill(box2);
		g.drawString("Player 2", box2.getX() - 19, box2.getY() - 20);
		}
		if (box2.getY() == 0) {
			g.drawString("YOU MADE IT!", 910, 540);
		}
		
	}

	@Override
	public Shape getCollisionBouds() {
		return box2;
	}

	@Override
	public boolean collidesWith(Collidable c) {
		return box2.intersects(c.getCollisionBouds());
	}

}