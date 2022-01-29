package chapter3.practice07;

public interface Buy {
	void buy();
	
	default void order() {
		System.out.println("buy order");
	}
}
