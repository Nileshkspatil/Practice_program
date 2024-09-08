package strings;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] s= {"goa","maharastra","mumbai","delhi","dd"};
		int small=0;
		
		for (int i = 1; i < s.length; i++) {
			if(s[i].length()<s[small].length()) {
				small=i;
			}
		}
		System.out.println(s[small]);

	}

}
