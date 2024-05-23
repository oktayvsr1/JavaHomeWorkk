package Homework2;

import java.util.Scanner;

public class Common {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of arrays: ");
		int size1=scanner.nextInt();
		int[] numbers1=new int[size1];

		int[] numbers2=new int[size1];
		System.out.println("Enter the elements of first array:");
		for(int i=0;i<size1;i++) {
			numbers1[i]=scanner.nextInt();
		}
		System.out.println("Enter the elements of second array: ");
		for(int i=0;i<size1;i++) {
			numbers2[i]=scanner.nextInt();
		}
		
		System.out.println("Common elements: ");
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size1;j++) {
				if(numbers1[i]==numbers2[j]) {
					System.out.println(numbers1[i]);
				}
			}
		}
	}

}
