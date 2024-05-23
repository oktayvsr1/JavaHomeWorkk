package Homework2;

import java.util.ArrayList;

public class EvenAndOdd {

	public static void main(String[] args) {
		int numbers[]= {10,14,11,5,7,8,9};
		int numbers2[]=new int[numbers.length];
		int a=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {
				numbers2[a]=numbers[i];
				a++;
			}
		}

		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2!=0) {
				numbers2[a]=numbers[i];
				a++;
			}
		}
		
		for(int i=0;i<numbers2.length;i++) {
			System.out.println(numbers2[i]);
		}
	
		
		
		
		

	}

}
