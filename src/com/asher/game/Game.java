package com.asher.game;

import java.util.ArrayList;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Shape;

import com.asher.game.entities.BaseEntity;

public class Game extends BasicGame 
{
	private ArrayList<BaseEntity> entityList;
	
	
	public Game (String gamename) {
		super(gamename);
		this.entityList = new ArrayList<BaseEntity>();
		
	}

	@Override
	public void init(GameContainer gc) throws SlickException {}
	
	@Override
	public void update(GameContainer gc, int i) throws SlickException {
		for(BaseEntity e : entityList ) {
			e.update(gc, i);
		}
	}


	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		for(int i = 0; i < entityList.size(); i++) {
			entityList.get(i).render(container, g);
		}
		
	}
	
	
	
}