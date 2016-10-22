import java.util.Scanner;

class DiceGame {
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
	Player p1;
	Player p2;
	public void startGame (String p1name,  String p2name) {
		Player p1 = new Player(p1name);
		Player p2 = new Player(p2name);
		System.out.println(p1name + "'s turn");
		p1.play();
		System.out.println(p2name + "'s turn");
		p2.play();
		if (p1.getNum() > p2.getNum()) {
           			System.out.println(p1.getName() + " won");
        		}
		else if (p1.getNum() == p2.getNum()) {
		                System.out.println(" draw");
		}
		else
		                System.out.println(p2.getName() + " won");
		}
}
