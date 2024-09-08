package numberSystem;
//convert binary to decimal

public class P2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1100;
		int bin=0, power=0;
		while(n!=0) {
			int d=n%10;
			bin=bin+pow(2,power++)*d;
			n=n/10;
		}
		System.out.println(bin);
		

	}
	public static int pow(int d, int p) {
		int res=1;
		for(int i=1; i<=p; i++) {
			res=res*d;
		}
		return res;
	}

}
