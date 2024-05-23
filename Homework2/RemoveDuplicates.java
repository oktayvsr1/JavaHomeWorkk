package Homework2;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int numbers[]= {10,15,2,10,14,78};
		int size=numbers.length;
		ArrayList<Integer> number=new ArrayList<>();
		for(int i=0;i<size;i++) {
			int count=0;
			for(int j=i+1;j<size;j++) {
				if(numbers[i]==numbers[j]) {
					count++;
				}
			}
			if(count<1) {
				number.add(numbers[i]);
			}
		}
		
		int numbers2[]=new int[number.size()];
		
		for(int i=0;i<numbers2.length;i++) {
			numbers2[i]=number.get(i);
		}
		
		
		for(int i=0;i<numbers2.length;i++) {
			System.out.println(numbers2[i]);
		}
		
		

	}

}
