package class5loopspatterns;

public class LaunchRestAlphanbets {
	public static void main(String[] args) {
		// Pattern Programming for - K Z M N Q R Y X W V
		int n = 7;
		
		for(int i=0; i<n; i++) {
			
			// K
			for(int j=0; j<n; j++) {
				//System.out.print("*");
				if(j==0 || i+j == (n-1)/2 || (i-j == (n-1)/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print("    ");
			
			// Z
			for(int j=0; j<n; j++) {
				//System.out.print("*");
				if(i==0 || i==(n-1) || i+j == n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print("    ");
			
			// M
			for(int j=0; j<n; j++) {
				//System.out.print("*");
				if(j==0 || j== n-1 || ((i+j==(n-1)) && i<=(n-1)/2) || ((i==j) && i<=(n-1)/2) ){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print("    ");
			
			System.out.println();
		}

	}

}
