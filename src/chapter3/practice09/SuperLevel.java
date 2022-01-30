package chapter3.practice09;

public class SuperLevel implements PlayerLevel{

	@Override
	public void run() {
		System.out.println("엄청 빠르게 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 jump 합니다. ");
		
	}

	@Override
	public void turn() {
		System.out.println("turn 합니다. ");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** 고급자 레벨입니다 ******");
		
	}

	@Override
	public void go(int count) {
		run();
		for(int i=0;i<count;i++) {
			jump();
			turn();
		}
		
		
		
	}


}
