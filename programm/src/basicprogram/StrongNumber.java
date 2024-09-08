package basicprogram;

public class StrongNumber {
	public static void checkStrongNumber(int n) {
		
		int sum=0, temp=n;
		while(n!=0) {
			int d=n%10;
			sum=sum+factorial(d);
			n=n/10;
		}
		if(sum==temp) {
			System.out.println(temp+": "+ " no is strong ");
		}
	}
	public static int factorial(int n) {
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=1; n<=1000; n++) {
			checkStrongNumber(n);
		}
		
	}

}
