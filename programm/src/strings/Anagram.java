package strings;

public class Anagram {
	public static char[ ] sort(char [] ch) {
	
		for (int i = 0; i < ch.length; i++) {
			
			for (int j = i+1; j < ch.length; j++) {
				
				if(ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
				
			}
			
			
		}
		return ch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="cat";
		String s2="act";
		boolean b=true;
		if(s1.length()==s2.length()) {
			char[ ] ch1=s1.toCharArray();
			char[ ] ch2=s2.toCharArray();
			sort(ch1);
			sort(ch2);
			
			for (int i = 0; i < ch2.length; i++) {
				 if(ch1[i]!=ch2[i]) {
					 b=false;
				 }
			}
		
		}
		if(b==true) {
			System.out.println("Anamgram");
		}else {
			System.out.println("not anagram");
		}

	}

}
