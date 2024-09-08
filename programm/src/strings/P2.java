package strings;

import java.util.Arrays;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="welcome to thane";
		String [] a=s.split(" ");
		System.out.println(Arrays.toString(a));
		
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}

	}

}
