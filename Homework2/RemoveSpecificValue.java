package Homework2;

import java.util.Scanner;

public class RemoveSpecificValue {

	public static void main(String[] args) {
		int numbers[]= {10,45,78,5,1,25,36};
		int size=numbers.length;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the specific value: ");
		int spec=scanner.nextInt();
		
		int newArray[]=new int[size-1];
		int index=0;
		for(int num:numbers) {
			if(num!=spec) {
			newArray[index++]=num;
			}
		}
		
		for(int i=0;i<newArray.length;i++) {
			System.out.println(newArray[i]);
		}
		
		
		
		
		
		

	}

}
