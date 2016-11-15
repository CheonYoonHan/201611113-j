import java.util.Scanner;

public class Grade{
	public static void main(String[]args){
		double marks;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your marks : ");
		marks = scanner.nextDouble();
		if(90<=marks && marks <=100){
			System.out.println("Your Grade is A");
		}
		else if(80<=marks && marks <90){
			System.out.println("Your Grade is B");
		}
		else if(70<=marks && marks <80){
			System.out.println("Your Grade is C");
		}
		else if(60<=marks && marks <70){
			System.out.println("Your Grade is D");
		}
		else if(0<=marks && marks <60){
			System.out.println("Your Grade is F");
		} 
		else {System.out.println("Error");}

	}
}
