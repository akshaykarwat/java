package practice321;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=4;j++) {
				if( i<=3 && j<=i) {
					System.out.print("*");
				}else if(i==4) {
					System.out.print("*");
				}else if( i>=5 && j<=8-i ) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
			
			}
			System.out.println();
			
		}
	}
	
	}
			
	


