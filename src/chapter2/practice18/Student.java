package chapter2.practice18;

import java.util.ArrayList;

public class Student {

	int id;
	String name;
	int total;
	
	ArrayList<Subject> lecture = new ArrayList<Subject>();

	
	public Student(int id, String name) {
		this.id=id;
		this.name = name;

	}
	
	public void totalAdd(int score) {
		total+=score;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void showInfo() {
		

		for(Subject subject : lecture) {
			System.out.println(subject.name +" "+ subject.score);
			
			totalAdd(subject.score);
		}
		
		System.out.println("sum : " + getTotal());
	}
	

	
	
	
	
}
