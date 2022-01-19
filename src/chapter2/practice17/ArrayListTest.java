package chapter2.practice17;

import java.util.ArrayList;

import chapter2.practice15.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<Book>();
		library.add(new Book("태백산맥1","조영래"));
		library.add(new Book("태백산맥2","조영래"));
		library.add(new Book("태백산맥3","조영래"));
		library.add(new Book("태백산맥4","조영래"));
		library.add(new Book("태백산맥5","조영래"));
		
		for(int i=0;i<library.size();i++) {
			library.get(i).showInfo();
		}

	}

}
