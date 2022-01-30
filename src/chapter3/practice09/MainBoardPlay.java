package chapter3.practice09;

public class MainBoardPlay {

	public static void main(String[] args) {
		
		 Player player = new Player();
		 player.play(1);
		 
		 AdvancedLevel a = new AdvancedLevel();
		 player.upgradeLevel(a);
		 player.play(2);
		 
		 SuperLevel s = new SuperLevel();
		 player.upgradeLevel(s);
		 player.play(3);
	}

}
