package arrays;

public class Large {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {19,50,23,56,41,-65};
		int large=0;
		for(int i=0; i<a.length; i++) {
			
			if(a[i]>large) {
				large=a[i];
			}
		}
		System.out.println("largest element of the array: "+large);

	}

}
