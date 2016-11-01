import ch.aplu.turtle.*;
public class baram{
	Turtle t1=new Turtle();
	public static void main(String[]args){
		int sides=3;
		int size=5;
		int bigger=15;
		double degree=90.0f;
		int turns=10;
		baram BR=new baram();
		BR.makeSwirlSquare(sides, size,bigger,turns,degree);
	}
	void makeSwirlSquare(int sides,int size, int bigger, int turns, double degree){
		for(int i=0;i<turns;i++) {
			if(i%sides-1 !=0) {
				size+=bigger;
			}
		t1.fd(size);
		t1.right(degree);
		}
	}

}