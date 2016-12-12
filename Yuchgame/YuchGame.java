package com.sd.YuchGame;
import java.util.Scanner;

public class YuchGame extends DiceGame{
	public static void main(String[] args) {
		String p1name;
		String p2name;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Player1 Name : ");
		p1name = scanner.nextLine();
		System.out.println("Input Player2 Name : ");
		p2name = scanner.nextLine();
		new DiceGame().startGame(p1name,p2name);
	}
}
