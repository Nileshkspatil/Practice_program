package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the no of elements: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter element: ");
		for (int i = 0; i < a.length; i++) {
			
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));

	}

}
