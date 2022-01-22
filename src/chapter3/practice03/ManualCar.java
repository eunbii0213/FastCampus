package chapter3.practice03;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다");
		System.out.println("사람이 핸들을 조종합니다");
		
	}

	@Override
	public void stop() {
		System.out.println("브레이크를밟아 정지 합니다");
		
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		
	}
	
	

}
