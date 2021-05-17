package pattern;

public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for( int i=1;i<=4;i++) {
	for ( int j=1;j<=8-i;j++) {
		if((j>=i)&&(j<=8-i)) {
			System.out.print("*");
		
			
		}else {
			System.out.print(" ");
		}
		
	}
	System.out.println();
}
	}

}
