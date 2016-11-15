public class Leapyear{
	public static void main(String[] args) {
		int [] years={1800,1900,1912,1984,1985,2000,2015,1825,1928,2031,1845,1947,2053,2099};
		for(int year:years) {
			if((year % 4== 0) && (year % 100 != 0) || (year % 400==0)) {
				System.out.printf("Year %d is a leap year.\n", year);
			} else {
				System.out.printf("Year %d is not a leap year.\n", year);
			}
		}
	}
}