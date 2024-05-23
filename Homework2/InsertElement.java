package Homework2;

import java.util.Scanner;

public class InsertElement {

	public static void main(String[] args) {
		int numbers[]= {10,45,78,5,1,25,36};
		int size=numbers.length;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the insert value: ");
		int spec=scanner.nextInt();
		System.out.println("Enter the specific position in array: ");
		int position=scanner.nextInt();
		int[] numbers2=new int[size+1];
		for(int i=0,j=0;i<size+1;i++) {
			if(position==i) {
				numbers2[i]=spec;
				
			}
			else {
				numbers2[i]=numbers[j];
				j++;
			}
		}
		
		for(int i=0;i<size+1;i++) {
			System.out.println(numbers2[i]);
		}
		

	}

}
