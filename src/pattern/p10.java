package pattern;

public class p10 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=10-i;j++) {
			if((j>=i)&&(j<=10-i) ) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	}

}
