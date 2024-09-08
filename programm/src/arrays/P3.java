package arrays;
//sum of digit sum of equal to 5

public class P3 {
	public static void demo(int  a[]) {
		
		for (int i = 0; i < a.length; i++) {
			
		 int n=a[i];
		 int sum=0;
		 while(n!=0) {
			 int d=n%10;
			 sum=sum+d;
			 n=n/10;
		 }
		 if(sum==5) {
			 System.out.print(a[i]+" ");
		 }
		}
	}
	
	public static void main(String[] args) {
		int a []= {19,50,23,56,41};
		demo(a);
	}

}
