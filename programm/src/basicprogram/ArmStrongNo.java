package basicprogram;

public class ArmStrongNo {
	
	public static void checkArmStrongNo(int n) {
		 int temp=n, sum=0; 
		int count=countOfDigit(n);
		//System.out.println(count);
		while(n!=0) {
			int d=n%10;
			sum=sum+powerOf(d, count);
			n=n/10;
		}
		if(temp==sum) {
			System.out.println(temp+": " +"no is armstrong");
		}
	}
	public static int powerOf(int d, int count) {
		int pow=1;
		for(int i=1; i<=count; i++) {
			pow=pow*d;
		}
		return pow;
	}
	public static int countOfDigit(int n) {
		int count=0;
		while(n!=0) {
			
			count++;
			n=n/10;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=1; n<=1000; n++) {
		checkArmStrongNo(n);
		}
	}

}
