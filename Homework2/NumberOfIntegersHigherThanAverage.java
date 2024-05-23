package Homework2;

import java.util.ArrayList;

public class NumberOfIntegersHigherThanAverage {

	public static void main(String[] args) {
		int numbers[]= {10,2,54,4,78,95,7,15,22};
		int size=numbers.length;
		int total=0;
		for(int i=0;i<size;i++) {
			total=total+numbers[i];
		}
		int average=total/size;
		int count=0;
		for(int i=0;i<size;i++) {
			if(numbers[i]>average) {
				count++;
			}
		}
		System.out.println(count+" numbers are higher than average of given integer array");

	}

}
