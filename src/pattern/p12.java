package pattern;

public class p12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( int i=1;i<=4;i++) {
			for ( int j=1;j<=8-i;j++) {
				if((i==1)||i+j==2*i||j-i==6||j-i==4||j-i==2){
					System.out.print("*");
				
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
