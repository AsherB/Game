package com.asher.funGame.entities;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;

public class BackGround extends BaseEntity {
	private Rectangle backGround;
	private Image texture;
	
	public BackGround(int zIndex, int x, int y, int width, int height) {
		super(zIndex);
		backGround = new Rectangle(x, y, width, height);
		try {
			texture = new Image("assets/water6cx.png");
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

	

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		

	}
 
	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		g.drawImage(texture, backGround.getX(), backGround.getY());
		

	}

}
