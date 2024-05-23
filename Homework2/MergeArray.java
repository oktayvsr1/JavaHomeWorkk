package Homework2;

public class MergeArray {

	public static void main(String[] args) {
		int numbers[]= {2,8,11,12};
		int size=numbers.length;
		int numbers2[]= {1,2,3,4};
		int size2=numbers2.length;
		sort(numbers);
		sort(numbers2);
		int merge[]=new int[size+size2];
		int i=0;
		int j=0;
		int l=0;
		while(i<size && j<size2) {
			if(numbers2[j]<numbers[i]) {
				merge[l]=numbers2[j];
				l++;
				j++;
				
			}
			else {
				merge[l]=numbers[i];
				l++;
				i++;
				
			}
		}
		
		while(i<size) {
			merge[l]=numbers[i];
			l++;
			i++;
		}
		while(j<size2) {
			merge[l]=numbers2[j];
			l++;
			j++;
		}
		
		for(int a=0;a<merge.length;a++) {
			System.out.println(merge[a]);
		}
		
		
		
		

	}
	
	private static int[] sort(int[] a) {
		int size=a.length;
		int insert;
		
		for(int next=1;next<size;next++) {
			int move=next;
			insert=a[next];
			while((move>0)&&(a[move-1]>insert)) {
				a[move]=a[move-1];
				move--;
			}
			a[move]=insert;
		}
		return a;
	}

}
