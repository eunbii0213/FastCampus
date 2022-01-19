package chapter2.practice18;

import java.util.ArrayList;

public class ScoreTest {

	public static void main(String[] args) {
		
		Student lee = new Student(1001,"Lee");
		Student kim = new Student(1002,"Kim");

		
		lee.lecture.add(new Subject("국어",100));
		lee.lecture.add(new Subject("수학",50));
		
		lee.showInfo();
		
		
		kim.lecture.add(new Subject("국어",70));
		kim.lecture.add(new Subject("수학",85));
		kim.lecture.add(new Subject("영어",100));
		

		kim.showInfo();
		
	}

}
