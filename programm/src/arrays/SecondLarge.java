package arrays;

public class SecondLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {50,70,23,56,41,-65,56};
		int large=a[0],slarge=0;
		
		for (int i = 1; i < a.length; i++) {
			
			if(a[i]>large) {
				slarge=large;
				large=a[i];
				
			}else if(a[i]>slarge && a[i]!=large) {
				slarge=a[i];
			}
			
			
		}
		System.out.println(slarge);
	
	}

}
