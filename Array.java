package datastructure;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int a[] = new int[5];
		a[0]=0;
		a[1]=1;
		a[2]=2;
		a[3]=3;
		a[4]=4;
		
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
		
		int[] num = {1, 2, 3, 4, 5};
		int length = num.length;
		System.out.println(length);
		
		int[] number2 = {5, 2, 8, 1, 3};
		Arrays.sort(number2);
		
		   for (int number : number2) {
	            System.out.print(number + " ");
	        }
		
	}
}
