import java.util.Scanner;
public class Conversion{
	public static void main(String[]args){
		String corf;
		double temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("C or F: ");
		corf= scanner.nextLine();
		System.out.println("Input temperature : ");
		temp = scanner.nextDouble();
		if(corf.equals("F")){
			double c = (5/ (double) 9) * (temp-32);
			System.out.printf("%.1f C ", c);
		}
		else if(corf.equals("C")){
			double f = temp*1.8+32;
			System.out.printf("%.1f F", f); 
		}
	}
}
