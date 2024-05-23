package Homework2;

public class QonseguenceLength {

	public static void main(String[] args) {
		
		

	}
	
	public static int[] sort(int[] a) {
		int size=a.length;
		int insert;
		
		for(int next=1;next<size;next++) {
			int move=next;
			insert=a[move];
			while((move>0)&&(a[move-1]>insert)) {
				a[move]=a[move-1];
				move--;
			}
			a[move]=insert;
		}
		return a;
	}

}
