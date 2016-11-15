public class DrawStringtriangle{
	public static void main(String[] args) {
		String simbol="*";
		int height=15;
		new DrawStringtriangle().DrawStringtriangle(height, simbol);
	}
	void DrawStringtriangle(int height, String simbol){
		StringBuffer tri=new StringBuffer();
		StringBuffer spa=new StringBuffer();
		for(int i=0; i<height;i++){
			for(int k=0; k<(height-i-1);k++){
				tri.append(" ");
			}
			for(int j=0;j<i;j++) {
				tri.append(simbol) ;
			}
			for(int j=1;j<i;j++){
				tri.append(simbol);
			}
		System.out.printf("%d %s\n", i , tri.toString());
		tri.delete(0, tri.length());

		}
	}
}