package chapter2.practice12;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee lee = new Employee();
		lee.setEmployeeName("오은비");
		System.out.println(lee.getSerialNum());
		
		Employee kim = new Employee();
		kim.setEmployeeName("이상혁");
		//kim.serialNum++;
		
		System.out.println(lee.getSerialNum());
		System.out.println(kim.getSerialNum());
		
		
		System.out.println(lee.getEmployeeName()+"님의 사번은 "+lee.getEmployeeId()+"입니다.");
		System.out.println(kim.getEmployeeName()+"님의 사번은 "+kim.getEmployeeId()+"입니다. ");
		

	}

}
