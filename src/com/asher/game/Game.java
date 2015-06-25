package com.asher.game;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Shape;

public class Game extends BasicGame 
{

	public Game (String gamename) 
	{
		super(gamename);
	}

	@Override
	public void init(GameContainer gc) throws SlickException {}
	
	@Override
	public void update(GameContainer gc, int i) throws SlickException {}


	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		g.drawString("Howdy!", 100, 100);
	
	}
	
}