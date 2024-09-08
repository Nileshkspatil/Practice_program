package strings;

public class P6 {
	public static void demo(String s) {
		char [] ch=s.toCharArray();
		boolean b[]=new boolean[ch.length];
		//boolean [] b=new boolean(ch.length);
		for (int i = 0; i < b.length; i++) {
			
			if(b[i]==false) {
				
			int count=1;
			 
			for(int j=i+1; j<b.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
					b[j]=true;
				}
			}
			System.out.println(ch[i]+":" + count);
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="maharashtra";
		demo(s);
	}

}
