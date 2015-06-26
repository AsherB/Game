package com.asher.funGame;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Main {

	public static void main(String[] args) {
		try {
			AppGameContainer app = new AppGameContainer(new Game("My Game Title"));
			app.setDisplayMode(1920, 1080, false);
			app.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
