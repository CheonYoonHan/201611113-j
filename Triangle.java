public class Triangle{
	private int height;
	private int width;
	public Triangle(int h,  int w){
		this.height= h;
		this.width= w;
	}
	public int getHeight(){
		return height;
	}
	public int getWidth(){
		return width;
	}
	public double calsArea(){
		return height*width*0.5;
	}
	public static void main(String[] args){
		Triangle t=new Triangle(4,5);
		System.out.println(t.calsArea());
	}
}