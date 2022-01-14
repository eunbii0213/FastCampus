package chapter2.practice15;

public class ClassTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] libraryCopy = new Book[5];
		
		for(int i=0;i<library.length;i++) {
			library[i]= new Book("태백산맥", "조정래");
			System.out.println(library[i]);
			library[i].showInfo();
		}
		
		System.arraycopy(library, 0, libraryCopy, 0, 5);
		
		library[0].setAuthor("ddd");
		library[0].setTitle("ohh");
		library[0].showInfo();
		
		System.out.println();
		
		for(int i=0;i<library.length;i++) {
			
			System.out.println(libraryCopy[i]);
			libraryCopy[i].showInfo();
		}
		System.out.println();
		

		for(int i=0;i<library.length;i++) {
			libraryCopy[i]= new Book();
			libraryCopy[i].setAuthor(library[i].getAuthor());
			libraryCopy[i].setTitle(library[i].getTitle());
			
			System.out.println(libraryCopy[i]);
			libraryCopy[i].showInfo();
		}
		
		
		

	}

}
