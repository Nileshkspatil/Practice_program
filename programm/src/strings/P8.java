package strings;
//convert lower to upper

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		String s="at";
		char[] ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print((char)(ch[i]-32));
		}

	}

}
