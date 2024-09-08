package strings;

import java.util.Arrays;

// reverse the without changing position 
public class P3 {
	
	public static void reverseString(String s) {
		String [] a=s.split(" ");
		String rev="";
		System.out.println(Arrays.toString(a));
		for(int i=0; i<a.length; i++) {
			for(int j=a[i].length()-1; j>=0; j--) {
				rev=rev+a[i].charAt(j);
			}
		rev=rev+" ";
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to thane";
		reverseString(s);
	}

}
