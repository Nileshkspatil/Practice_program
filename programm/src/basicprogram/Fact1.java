package basicprogram;

public class Fact1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int n=1; n<=10; n++) {
			int fact=1;
			
			for(int i=1; i<=n; i++) {
				fact=fact*i;
			}
			System.out.println(n+": "+fact);
		}
	}

}
