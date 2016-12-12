package com.sd.YuchGame;
public class DecideYuch{
	private int run = 0;
	private int back = 0;
	public void Decide(){
		CalcYuch c=new CalcYuch();
		c.calc();
		if (c.getSum()==0) {
			System.out.println("Mo! One more Time!");
			run=4;
		}
		else if (c.getSum()==1) {
			back= (int) (Math.random()*3);
			if (back==0) {
				System.out.println("Backdo!");
				run=-1;
			}
			else{
				System.out.println("Do!");
				run=1;
			}		
		}
		else if (c.getSum()==2) {
			System.out.println("Gae!");
			run=2;
		}
		else if (c.getSum()==3) {
			System.out.println("Geol!");
			run=3;
		}
		else if (c.getSum()==4) {
			System.out.println("Yuch! One more Time!");
			run=5;
		}
	}
	public int getRun() {
			return this.run;
	}

}