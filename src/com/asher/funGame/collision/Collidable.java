package com.asher.funGame.collision;

import org.newdawn.slick.geom.Shape;

import com.asher.funGame.events.Event;

public interface Collidable {
	public Shape getCollisionBouds();
	
	public boolean collidesWith(Collidable c);
	
	public void invokeEvent(Event e);
}
