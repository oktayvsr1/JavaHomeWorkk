package Homework2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortANumericArray {

	public static void main(String[] args) {
		int[] numbers= {5,7,1,15,2,14};
		String[] words= {"car","otobus","apple","laptop"};
		
		sortInt(numbers);
		sortStr(words);
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		System.out.println();
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
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
	
	public static String[] sortStr(String[] a) {
		int size=a.length;
		String insert;
		
		for(int next=1;next<size;next++) {
			insert=a[next];
			int move=next;
			while(a[move-1].charAt(0)>a[move].charAt(0)) {
				a[move]=a[move-1];
				move--;
			}
			a[move]=insert;
		}
		return a;
		
		
	}
	

}
