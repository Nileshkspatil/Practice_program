package arrays;
//search element and postion

public class P4 {
	
	public static void searchElement(int a[], int search) {
		boolean b=true;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==search) {
				System.out.println(a[i]+":: "+"position:"+i);
				b=false;
				break;
			}
			
		}
		if(b==true) {
			System.out.println("element is not present");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {50,70,23,56,41,-65,56};
		searchElement(a, 50);
		searchElement(a, 56);
		searchElement(a, 103);
	}

}
