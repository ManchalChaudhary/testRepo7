package matrixCalx;

public class Matrix {
	
	public static void main(String[] args) {
		
		int a = 6;
		//break point, debug mode: step into, step over, step return
		for(int i= 1; i<=a; i++) {
			
			for(int j=1; j<=a; j++) {
				
				System.out.print(i*j + "\t" );
			}
			System.out.println();
			
		}
	}

}
