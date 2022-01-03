package chapter2.practice10;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student James = new Student("James",5000);
		Student Tomas = new Student("James",10000);
		
		Bus bus733 = new Bus(733);
		Bus bus133 = new Bus(133);
		
		James.takeBus(bus733);
		
		Subway subwayone = new Subway(1);
		
		Tomas.takeSubway(subwayone);
		
		James.showInfo();
		Tomas.showInfo();
		
		bus733.showBusInfo();
		subwayone.showSubwayInfo();
	}

}
