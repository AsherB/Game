package com.asher.funGame.events;

public class SpawnEvent extends Event {

	public int data;
	
	public SpawnEvent(int entID) {
		super("SpawnEvent", new Object[] {entID});
		this.data = entID;
	}
	
}
