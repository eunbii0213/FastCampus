package chapter2.practice16;

public class TwoDimensionTest {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6,7}};
		
		int i,j;
		
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[j].length;j++) {
				System.out.println();
			}
			System.out.println(", \t"+arr[i].length);
			System.out.println();
		}

	}

}
