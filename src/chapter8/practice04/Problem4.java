package chapter8.practice04;

public class Problem4 {

	public static void main(String[] args) {
		System.out.println(fibo(5));

	}
	
	public static int fibo(int number) {
		
		if(number<=1) {
			return 1;
		}
		
		else return number*fibo(number-1);
	}

}
