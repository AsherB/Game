package com.asher.funGame;

import java.io.File;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Main {

	public static void main(String[] args) {
		System.setProperty("java.library.path", "libs");
		System.setProperty("org.lwjgl.librarypath", new File("libs/natives").getAbsolutePath());
		try {
			AppGameContainer app = new AppGameContainer(new Game("Doge the Bullets"));
			app.setDisplayMode(1920, 1080, true);
			app.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
