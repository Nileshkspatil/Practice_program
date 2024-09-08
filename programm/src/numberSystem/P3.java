package numberSystem;
//convert octal to binary
//octal->binary->decimal

public class P3 {
	public static int pow(int n, int p) {
		int res=1;
		for(int i=1; i<=p; i++) {
			res=res*n;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int n=14, sum=0, p=0;
				while(n!=0) {
					int d=n%10;
					sum=sum+pow(8,p++)*d;
					n=n/10;
				}
				String s=" ";
				while(sum!=0) {
					int d=sum%2;
					s=d+s;
					sum=sum/2;
				}
				System.out.println(s);
				
	}

}
