package strings;

public class Palindrom {
	public static void checkPalindrom(String s) {
		s=s.trim();
		String rev="";
		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		
		if(rev.equalsIgnoreCase(s)) {
			System.out.println("String is palindrom");
		}else {
			System.out.println("String is not palindrom");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" level ";
		checkPalindrom(s);

	}

}
