package com.sd.YuchGame;

public class Yuch {
	private int number = 0;
	public void roll() {
		number = (int) (Math.random() * 2);
		if (number==0) {
			System.out.println("Yuch isn't upside down!");
		}
		else{
			System.out.println("Yuch is upside down!");
		}
	}
	public int getNum() {
		return this.number;
	}
}