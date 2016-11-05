public class CalBMI{
	public static void main(String[] args) {
		float weight=70f;
		float height= 1.7f;
		new CalBMI().CalBMI(weight, height);
	}
	void CalBMI(float weight, float height){
		float bmi=weight/ (height*height);
		System.out.printf("Your bmi is %.1f\n",bmi);
		if(bmi >= 18.5 && bmi<23) {
			System.out.println("normal weight");
		}
		else if (bmi <18.5){
			System.out.println("low weight");
		}
		else if (bmi >= 23 && bmi<25){
			System.out.println("over weight");
		}
		else if (bmi >= 25 && bmi<30){
			System.out.println("obesity 1");
		}
		else if (bmi >= 30 && bmi< 40){
			System.out.println("obesity 2");
		}
		else if (bmi <=40){
			System.out.println("ovesity 3");
		}
		else {
			System.out.println("Error");
		}
	}
}