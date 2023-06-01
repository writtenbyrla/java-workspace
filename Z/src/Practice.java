import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int num = Integer.parseInt(sc.nextLine());
		int[] Arr = new int[num];
		
		
		for(int i=0; i<Arr.length; i++ ) {
			int x = Integer.parseInt(sc.nextLine());
			int y = Integer.parseInt(sc.nextLine());
			
			if(x>0 && y>0) {   // Q1
				Arr[0]=count++;
			} else if(x<0 && y>0) { // Q2
				Arr[1]=count++;
			} else if(x<0 && y<0) { // Q3
				Arr[2]=count++;
			} else if(x>0&&y<0) { // Q4
				Arr[3]=count++;
			} else if(x==0 || y==0) { // x= 0 || y==0
				Arr[4]=count++;
			}
		}
		System.out.println();
		
	}
}
