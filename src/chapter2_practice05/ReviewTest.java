package chapter2_practice05;

public class ReviewTest {

	public static void main(String[] args) {
		
		Human Tomas = new Human();
		Tomas.age=37;
		Tomas.height=180;
		Tomas.name = "Tomas";
		Tomas.weight=78.0;
		
		System.out.println(Tomas.showInfo());
		
		Delivery delivery1 = new Delivery("202011020003",01023450001,"서울시 강남구 역삼동",20201102,130258,35000,0003);
		delivery1.showInfo();
	}

}
