package com.asher.funGame.entities;

import java.util.Random;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;

import com.asher.funGame.EntityManager;


public class Spawner extends BaseEntity {
Random r = new Random();
@SuppressWarnings("unused")
private Rectangle spawner;
int xx;
int yy;
int ww;
int hh;
	public Spawner(int zIndex, int x, int y, int width, int height) {
		super(zIndex);
		spawner = new Rectangle(x, y, 0, 0);
		this.xx = x;
		this.yy = y;
		this.ww = width;
		this.hh = height;
		EntityManager.instance.spawn(new Bullet(10, x, y, width, height));
		EntityManager.instance.spawn(new ReversedBullet(10, x, y, width, height));
		EntityManager.instance.spawn(new Bullet(10, x, y, width, height));
		EntityManager.instance.spawn(new ReversedBullet(10, x, y, width, height));
		EntityManager.instance.spawn(new Bullet(10, x, y, width, height));
		EntityManager.instance.spawn(new ReversedBullet(10, x, y, width, height));
		EntityManager.instance.spawn(new Bullet(10, xx, yy, width, height));
		EntityManager.instance.spawn(new ReversedBullet(10, xx, yy, width, height));
		EntityManager.instance.spawn(new Bullet(10, x, y, width, height));
		EntityManager.instance.spawn(new ReversedBullet(10, x, y, width, height));
		
		
	}

	@Override
	public void update(GameContainer container, int delta)throws SlickException {
		 Input in = container.getInput();
			if (in.isKeyPressed(Input.KEY_SPACE)) {
				EntityManager.instance.spawn(new Bullet(10, xx, yy, ww, hh));
				EntityManager.instance.spawn(new ReversedBullet(10, xx, yy, ww, hh));
			}
			
	}

	@Override
	public void render(GameContainer container, Graphics g)
			throws SlickException {
		

	}

}
