package chapter4.practice02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student st = new Student(100,"Lee");
		Student st1 = new Student(100,"Lee");
		
		System.out.println(st==st1);
		System.out.println(st.equals(st1));
		
		System.out.println(st.hashCode());
		System.out.println(st1.hashCode());
		
		
		System.out.println();
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i = 100;
		System.out.println(i.hashCode());
		
		Student copy = (Student) st1.clone();
		System.out.println(copy.toString());

	}

}
