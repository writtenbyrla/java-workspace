import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = Integer.parseInt(sc.nextLine());
		int[] arr = {0, 0, 0, 0, 0};

		for(int i=0; i<num; i++ ) {

			int x = sc.nextInt(); 
			int y = sc.nextInt();

			if(x>0 && y>0) {   
				arr[0]++;
			} else if(x<0 && y>0) { 
				arr[1]++;
			} else if(x<0 && y<0) {
				arr[2]++;
			} else if(x>0 && y<0) {
				arr[3]++;
			} else { 
				arr[4]++;
			}
		}
		System.out.println("Q1: " + arr[0]);
		System.out.println("Q2: " + arr[1]);
		System.out.println("Q3: " + arr[2]);
		System.out.println("Q4: " + arr[3]);
		System.out.println("AXIS: " + arr[4]);
	}
}
