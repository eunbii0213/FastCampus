package chapter8.practice02;

public class Problem2 {

	public static void main(String[] args) {
		int[] sortedArr = {12,25,31,48,54,66,70,83,95,108};
		
		int end=sortedArr.length-1;
		int middle;
		int start=0;
		
		int target = 83;
		
		while(start<=end) {
			
			middle=(start+end)/2;
			
			if(target == sortedArr[start]) {
				System.out.println(start+"번째 Index에 값이 존재 ");
				return;
			} else if(target == sortedArr[end]) {
				System.out.println(end+"번째 Index에 값이 존재 ");
				return;
			}else if(target == sortedArr[middle]) {
				System.out.println(middle+"번째 Index에 값이 존재 ");
				return;
			}else if(target<sortedArr[middle]) {
				//target이 중간값보다 작다면 왼쪽을 탐색
				end = middle-1;
			}else if(target>sortedArr[middle]) {
				//target이 중간값보다 크다면 오른쪽을 탐색
				start= middle+1;
			}
			
			
		
			
			
		}
		
		System.out.println("탐색 실패. 배열안에 해당 target값이 없습니다. ");
		
		
	}

}
