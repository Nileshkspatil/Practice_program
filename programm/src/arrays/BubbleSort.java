package arrays;

import java.util.Arrays;

public class BubbleSort {
	public static void sort(int a[]) {
		
		for (int i = 0; i < a.length; i++) {
			
			int temp=0;
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));
	}
public static void sortChar(char a[]) {
		
		for (int i = 0; i < a.length; i++) {
			
			char temp=0;
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {50,70,23,56,41,-65,56};
		sort(a);
		char [] b= {'t','e','j','u'};
		sortChar(b);

	}

}
