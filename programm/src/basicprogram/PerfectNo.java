package basicprogram;

public class PerfectNo {
	public static void checkPerfectNo(int n) {
		int sum=0;
		for(int i=1; i<n; i++) {
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println(n+": "+"no is perfect");
		}
//		else {
//			System.out.println("not perfect");
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int n=1; n<=1000;n++) {
			checkPerfectNo(n);
		}
		 
		//checkPerfectNo(45);

	}

}
