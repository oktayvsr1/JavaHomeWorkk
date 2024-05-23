package Homework2;

public class AppearsOnlyOnce {

	public static void main(String[] args) {
		int numbers[]= {10,22,15,8,10,15,22};
		
		for(int i=0;i<numbers.length;i++) {
			int count=0;
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]==numbers[j]) {
					count++;
				}
			}
			
			if(count<1) {
				System.out.println(numbers[i]);
				break;
			}
			
		}

	}

}
