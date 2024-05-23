package Homework2;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=scanner.nextInt();
		int a=0;
		while(number!=0) {
			int b=number%10;
			a=a*10+b;
			number=number/10;
		}
		System.out.println(a);

	}

}
