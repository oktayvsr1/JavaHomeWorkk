package Homework2;

import java.util.ArrayList;
import java.util.Arrays;

public class ReoveOccurences {

	public static void main(String[] args) {
		int numbers1[]= {10,11,5,7,8,5,11,55,5};
		int size=numbers1.length;
	
		ReoveOccurences.selectionSort(numbers1, size);
		for(int i=0;i<size;i++) {
			System.out.println(numbers1[i]);
		}
		
		
		

	}
	
	public static void selectionSort(int array[],int size ) {
		int smallest;
		for(int i=0;i<size;i++) {
			smallest=i;
			for(int j=i+1;j<size;j++) {
				if(array[j]<array[smallest]) {
					smallest=j;
				}
				
			}
			swap(array[smallest],array[i]);
		}
		
	}
	
	public static void swap(int a,int b) {
		int c=a;
		a=b;
		b=c;
	}
	
	

}
