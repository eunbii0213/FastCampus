package chapter4.practice06;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//Person person = new Person();과 같은 코드
		Class c1 = Class.forName("chapter4.practice06.Person");
		Person person = (Person)c1.newInstance();
		
		person.setName("Lee");
		System.out.println(person);
		
		Class c2 = person.getClass();
		Person person2 = (Person)c2.newInstance();
		System.out.println(person2);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c2.getConstructor(parameterTypes);
		
		Object[] initargs = {"Kim"};
		Person kim = (Person)cons.newInstance(initargs);
		System.out.println(kim);
	}

}
