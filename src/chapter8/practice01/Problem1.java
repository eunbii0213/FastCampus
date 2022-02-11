package chapter8.practice01;

public class Problem1 {

	public static void main(String[] args) {
		int[] arr = {10,55,23,2,79,101,82,30,45};
		
		int max=0;
		int min=999999999;
		
		int maxIndex=0;
		int minIndex=0;
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				maxIndex=i;
			}
			
			else if(min>arr[i]) {
				min=arr[i];
				minIndex=i;
			}
		}
		
		System.out.println(min+":최소 , "+max+":최대 ");
		System.out.println(minIndex+":최소인덱스 , "+maxIndex+":최대인덱스 ");

	}

}
