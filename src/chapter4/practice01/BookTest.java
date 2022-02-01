package chapter4.practice01;

class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		
	}

	@Override
	public String toString() {
		
		return title+","+author;
	}
	
	
}

public class BookTest {

	public static void main(String[] args) {
		
		Book book = new Book("데미안","헤르만 헤세");
		
		//package이름.class이름.가상memory값 출력 (16진수)
		System.out.println(book);
		
		String str = new String("test");
		
		//test출력. 주소값이 나오지 않음!
		// >> to String이 overriding되었기 때문 
		System.out.println(str);
		System.out.println(str.toString()); //이 둘은 같은 코드
		
		
		

	}

}
