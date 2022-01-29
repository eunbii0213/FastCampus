package chapter3.practice07;

public interface Sell {
	void sell();
	
	default void order() {
		System.out.println("sell order");
	}
}
