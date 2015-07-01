package com.asher.funGame;

import org.newdawn.slick.Input;
import org.newdawn.slick.command.Command;
import org.newdawn.slick.command.InputProvider;
import org.newdawn.slick.command.InputProviderListener;

import com.asher.funGame.events.CommandEvent;

public class InputBindings implements InputProviderListener {

	private InputProvider provider;
	
	public InputBindings(Input i) {
		provider = new InputProvider(i);
		provider.addListener(this);
		
		//Add Bindings here
	}
	
	@Override
	public void controlPressed(Command command) {
		if(command instanceof CommandEvent)
			((CommandEvent) command).invokeEvent();
	}

	@Override
	public void controlReleased(Command command) {
		
	}

}
