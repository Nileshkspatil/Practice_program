package strings;

import java.util.Arrays;

public class P5 {
	public static void demo(String s) {
		char[] a=s.toCharArray();
		//System.out.println(Arrays.to);
		for (int i = 0; i < a.length; i++) {
			if(a[i]=='a' || a[i]=='i'|| a[i]=='o'|| a[i]=='e'|| a[i]=='u') {
		a[i]='%';
		
		}
	}
		String s1=new String(a);
		System.out.println(s1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="tejaswini";
		demo(s);
	}

}
