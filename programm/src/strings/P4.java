package strings;

public class P4 {
	
	public static void reverseString(String s) {
		String rev="";
		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		String [] a=rev.split(" ");
		
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to thane";
		reverseString(s);
	}

}
