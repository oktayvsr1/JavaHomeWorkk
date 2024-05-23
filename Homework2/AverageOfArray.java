package Homework2;

import java.util.Scanner;

public class AverageOfArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the szie of a array: ");
		int size=scanner.nextInt();
		int[] numbers=new int[size];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<size;i++) {
			numbers[i]=scanner.nextInt();
					
		}
		int total=0;
		for(int i=0;i<size;i++) {
			total=total+numbers[i];
		}
		int average=total/size;
		System.out.println("Elements of higher than average of given array: ");
		for(int i=0;i<size;i++) {
			if(numbers[i]>average) {
				System.out.println(numbers[i]);
			}
		}
		

	}

}
