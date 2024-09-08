package basicprogram;

public class P1 {
	public static void demo(int n) {
		
		if(n<=10) {
			System.out.println(n);
			demo(++n);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo(1);

	}

}
