package c5_loops_patterns;

public class FillPattern {
	
	
	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i=0; i<n ;i++) {
			
		
		for(int j=0; j<n; j++) {
			//System.out.println("j, n, i " + j + ":" + n + ":" + i);
			if(j<(n-1)-i) {
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
			
		}
		System.out.println();
		}

	}

}
