package com.sd.YuchGame;
public class Player {
	private String name=null;
	private int score=0;
	public Player(String _name)  {
		name=_name;
	}
	public void play() {
		DecideYuch d=new DecideYuch() ;
		d.Decide();
		this.score=d.getRun() ;
		if (score==4) {
			d.Decide();
		}
		else if (score==5) {
			d.Decide();
		}
	}
	public String getName () {
		return this.name;
	}
	public int getScore() {
		return this.score;
	}
 }