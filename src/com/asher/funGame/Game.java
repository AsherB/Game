package com.asher.funGame;


import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import com.asher.funGame.collision.CollisionSystem;
import com.asher.funGame.entities.BackGround;
import com.asher.funGame.entities.Box;
import com.asher.funGame.entities.Box2;
import com.asher.funGame.entities.Bullet;
import com.asher.funGame.entities.Pirate1;
import com.asher.funGame.entities.Ground;
import com.asher.funGame.entities.ReversedBullet;
import com.asher.funGame.entities.Spawner;
import com.asher.funGame.events.Event;
import com.asher.funGame.events.EventHandler;
import com.asher.funGame.events.EventSystem;

/**
 * Contains all the code that makes events work. It should also be used to invoke and bind to "global" or "miscellaneous" events.
 * @author Isaac
 *
 */
@SuppressWarnings("unused")
public class Game extends BasicGame {
	boolean isSpawned;
	//Since we can't extend two classes
	private static EventSystem es = new EventSystem();
	private InputBindings bindings;
	
	public Game(String title) {
		super(title);
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		EntityManager.instance.__renderEntities(container, g);
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		bindings = new InputBindings(container.getInput());
		EntityManager.instance.spawn(new Box(10, 500, 1050, 25, 25));
		EntityManager.instance.spawn(new Box2(10, 400, 1050, 25, 25));
		EntityManager.instance.spawn(new Spawner(0, 0, 0, 0, 0));
		
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		EntityManager.instance.__updateEntities(container, delta);
		CollisionSystem.getInstance().update();
		isSpawned = true;
		Input in = container.getInput();
		
	}
	
	/**
	 * Adds an EventLister to this object. The listener will be invoked whenever this entity, or other objects, calls it's invokeEvent method.
	 * @param e The event to listen for
	 * @param handler The EventHandler to handle the event
	 */
	public static void addEventListener(Event e, EventHandler handler) {
		es.addEventListener(e, handler);
	}
	
	public static void addEventListener(String eventName, EventHandler handler) {
		es.addEventListener(eventName, handler);
	}
	
	/**
	 * Invokes an event in relation to the entity. It will call the EventHandler of other objects that have attached themselves to this event.
	 * @param e The event to invoke
	 */
	public static void invokeEvent(Event e) {
		es.invokeEvent(e);
	}
}
