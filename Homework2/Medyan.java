package Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Medyan {

	public static void main(String[] args) {

		  Scanner scanner=new Scanner(System.in);
		  System.out.println("Enter the size of array: "); 
		  int size=scanner.nextInt();
		  
		  int[] numbers=new int[size];
		  
		  System.out.println("Enter the elements of a array: "); 
		  for(int i=0;i<size;i++) { 
			  numbers[i]=scanner.nextInt(); 
		  }
		 
		int medyan=0;
		sort(numbers);
		
		if(size%2==0) {
			medyan=(numbers[size]/2)+(numbers[(size-2)/2]);
		}
		else {
			medyan=numbers[(size-1)/2];
		}
		
		System.out.println("Medyan is: "+medyan);
		

	}
	
	public static int[] sort(int[] a) {
		int size=a.length;
		int insert;
		
		for(int next=1;next<size;next++) {
			insert=a[next];
			int move=next;
			
			while((move>0)&&(a[move-1]>insert)) {
				a[move]=a[move-1];
				move--;
			}
			a[move]=insert;
		}
		return a;
	}
	
	

}
