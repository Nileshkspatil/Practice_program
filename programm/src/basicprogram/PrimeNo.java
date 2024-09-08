package basicprogram;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the no: ");
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int count=0;
		
		if(n==1|| n==0)
		{
			System.out.println("no is not prime");
		}else 
		{
			for(int i=1; i<n; i++)
			{
				if(n%i==0) {
					count++;
				}
			}
		}
		if(count==1) {
			System.out.println(n+": "+"no is prime");
		}else {
			System.out.println("no is not prime");
		}
		
	}

}
