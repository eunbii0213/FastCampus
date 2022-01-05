package chapter2.practice11;

public class TaxiTest {

	public static void main(String[] args) {
		Student edward = new Student("Edward",20000);
		edward.takeTaxi(10000);
		
		Taxi taxi = new Taxi("잘 간다 운수택시");
		taxi.takeTaxi(10000);
		
		edward.showStudentInfo();
		taxi.showTaxiInfo();
	}

}
