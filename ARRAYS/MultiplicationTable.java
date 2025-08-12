import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[10];
		
		for(int i=0;i<10;i++) {
			arr[i] = (i+1)*n;
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(n+" * "+(i+1)+" = "+arr[i]);
		}
	}

}