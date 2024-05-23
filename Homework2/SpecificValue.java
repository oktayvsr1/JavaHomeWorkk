package Homework2;

import java.util.Scanner;

public class SpecificValue {

	public static void main(String[] args) {
		int numbers[]= {10,45,78,5,1,25,36};
		int size=numbers.length;
		boolean isOk=false;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the specific value: ");
		int spec=scanner.nextInt();
		
		for(int i=0;i<size;i++) {
			if(numbers[i]==spec) {
				isOk=true;
			}
		}
		
		if(isOk) {
			System.out.println("Specific is in the array");
		}
		else {
			System.out.println("specific value is not in the array");
		}
		
		
		
		

	}

}
