import ch.aplu.turtle.*;
public class DrawShape{
	public static void main(String[] args){
		new DrawShape().draw();
	}
	enum Shape{Triangle, Sqaure}
	Shape sel=Shape.Triangle;
	int size=100;
	int sides;
	double angle;
	

	public DrawShape(){
		switch (sel) {
			case Triangle:
				sides=3;
				angle=120;
				break;
			case Sqaure:
				sides=4;
				angle=90;
				break;
		}
	}
	public void draw(){
		Turtle t1=new Turtle();
		for(int i=0; i<sides; i++) {
			t1.forward(size);
			t1.right(angle);
		}
	}
}
