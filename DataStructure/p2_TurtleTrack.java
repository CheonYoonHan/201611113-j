import java.util.ArrayList;
import ch.aplu.turtle.*;
public class p2_TurtleTrack{
	static void Turtletrack(){
		Turtle t1= new Turtle();
		Double [] pos=new Double[2];
		ArrayList<Double[]> posArr = new ArrayList<Double[]>();
		for (int i=0;i<4;i++) {
			pos[0]=t1.getX();
			pos[1]=t1.getY();
			posArr.add(pos);
			t1.forward(100);
	    		t1.right(90);
			}
		for(Double[] d:posArr){
			System.out.printf("(%.1f,%.1f)", d[0],d[1]);
		}
	}
	public static void main(String[] args){
		Turtletrack();
	}
}