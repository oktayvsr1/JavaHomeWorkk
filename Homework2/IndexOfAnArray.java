package Homework2;

import java.util.Scanner;

public class IndexOfAnArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of given array: ");
		int size=scanner.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
		}
		
		System.out.println("Enter the element of array");
		int element=scanner.nextInt();
		
		if(findIndex(array,element)!=1) {
			System.out.println("Elemet found with this "+findIndex(array, element)+" index");
		}
		else {
			System.out.println("Element didnot fount");
		}
		

	}
	
	public static int findIndex(int[] numbers, int element) {
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==element) {
				return i;
			}
		}
		return -1;
	}

}
