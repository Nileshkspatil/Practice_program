package basicprogram;

public class ReverseNo {
	public static void checkReversNo(int n) {
		int temp=n, sum=0;
		
		 while(n!=0) {
			 int d=n%10;
			 sum=sum*10+d;
			n=n/10;
		 }
		 if(temp==sum) {
			 System.out.println(temp+": number is reverse");
		 }else {
			 System.out.println("no is not reverse");
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkReversNo(323);
		checkReversNo(3823);

	}

}
