package chapter3.practice09;

public class AdvancedLevel implements PlayerLevel{
	
	public AdvancedLevel() {
		
	}

	@Override
	public void run() {
		System.out.println("빨리 달립니다. ");
		
	}

	@Override
	public void jump() {
		System.out.println("높이 jump 합니다.");
		
	}

	

	@Override
	public void showLevelMessage() {
		System.out.println("****** 중급자 레벨입니다 ******");
		
	}

	@Override
	public void go(int count) {
		run();
		for(int i=0;i<count;i++) {
			jump();
		}
		turn();
		
	}


	@Override
	public void turn() {
		System.out.println("turn 못하지롱");
		
	}

}
