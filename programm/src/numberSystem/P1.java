package numberSystem;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		String rev="";
		while(n!=0) {
			int d=n%2;
			rev=d+rev;
			n=n/2;
		}
		System.out.println(rev);
	}

}
