package practice321;

public class numberSeries1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("   2nd       ");

		// 1
		// 2 2
		// 3 3 3
		// 4 4 4 4
		// 5 5 5 5 5
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");

			}
			System.out.println();
		}
		System.out.println("  3rd");
		
		//1
		//2 3
		//4 5 6 
		//7 8 9 10
		int count=1;
		for( int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		
		}

	


}