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
	public Spawner(int zIndex, int x, int y, int width, int height) {
		super(zIndex);
		spawner = new Rectangle(x, y, 0, 0);
		this.xx = x;
		this.yy = y;
		EntityManager.instance.spawn(new Bullet(10, x, y, 30, 30));
		EntityManager.instance.spawn(new ReversedBullet(10, x, y, 30, 30));
		EntityManager.instance.spawn(new Bullet(10, x, y, 45, 45));
		EntityManager.instance.spawn(new ReversedBullet(10, x, y, 35, 35));
		EntityManager.instance.spawn(new Bullet(10, x, y, 20, 20));
		EntityManager.instance.spawn(new ReversedBullet(10, x, y, 40, 40));
		

	}

	@Override
	public void update(GameContainer container, int delta)throws SlickException {
		 Input in = container.getInput();
			if (in.isKeyPressed(Input.KEY_SPACE)) {
				EntityManager.instance.spawn(new Bullet(10, xx, yy, 30, 30));
				EntityManager.instance.spawn(new ReversedBullet(10, xx, yy, 30, 30));
			}
	}

	@Override
	public void render(GameContainer container, Graphics g)
			throws SlickException {
		

	}

}
