package Homework2;

public class EqualityOfTwoArray {

	public static void main(String[] args) {
		int numbers1[]= {1,2,3,4,5};
		int numbers2[]= {1,2,3,4,5};
		int count=0;
		if(numbers1.length==numbers2.length) {
			for(int i=0;i<numbers1.length;i++) {
				if(numbers1[i]==numbers2[i]) {
					count++;
				}
				else {
					System.out.println("Two arrays are not equal");
				}
			}
			if(count==numbers1.length) {
				System.out.println("two arrays are equal");
			}
		}
		else {
			System.out.println("Two arrays are not equal");
		}

	}

}
