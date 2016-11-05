public class gugudan{
	public static void main(String[] args) {
	int[] x={1,2,3,4,5,6,7,8,9};
	System.out.println("Mulitiplecation");
	for(int i: x) {
		System.out.printf("\n%d dan -",i);
		for(int j: x) {
			System.out.printf("\t%dx%d=%d ", i, j, i*j);
		}
	}	
	}
}