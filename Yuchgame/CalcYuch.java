package com.sd.YuchGame;
public class CalcYuch{
	private int sum=0;
	private int num=0;
	public void calc(){
		Yuch y=new Yuch();
		for (int i =0;i <=3;i++ ) {
			y.roll();
			this.num=y.getNum();
			sum=sum+num;
		}
	}
	public int getSum(){
		return this.sum;
		}
}