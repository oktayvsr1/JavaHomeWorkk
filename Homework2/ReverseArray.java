package Homework2;

public class ReverseArray {

	public static void main(String[] args) {
		int numbers[]= {10,14,11,5,7,8,9};
		int size=numbers.length;
		int numbers2[]=new int[size];
		
		for(int i=0;i<size;i++) {
			numbers2[size-1-i]=numbers[i];
		}
		for(int i=0;i<size;i++) {
			System.out.println(numbers2[i]);
		}

	}

}
