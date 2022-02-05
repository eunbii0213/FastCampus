package chapter4.practice04;

public class StringTest {

	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java));
		//java = java.concat(android);
		
		System.out.println(System.identityHashCode(java));
		
		//연결된 output의 주소가 다름 >> java, android, javaandroid 모두 다른 주소
		//garbage 많이 나올 수 있으므로 stringbuilder 사용 추천
		
		StringBuilder sb = new StringBuilder(java);
		System.out.println(System.identityHashCode(sb));
		sb.append(android);
		System.out.println(System.identityHashCode(sb));
		
		String test = sb.toString();
		System.out.println(test);
		
		

	}

}
