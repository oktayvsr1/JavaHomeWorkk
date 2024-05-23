package Homework2;

import java.util.Scanner;

public class KLragest {

	public static void main(String[] args) {
		int numbers[]= {10,25,1,5,78,95};
		sortInt(numbers);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number that largest number: ");
		int a=scanner.nextInt();
		int numbers2[]=new int[a];
		for(int i=0;i<a;i++) {
			numbers2[i]=numbers[numbers.length-1-i];
		}
		
		for(int i=0;i<a;i++) {
			System.out.println(numbers2[i]);
		}

	}
	
	public static int[] sortInt(int[] a) {
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
