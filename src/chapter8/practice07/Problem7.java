package chapter8.practice07;

public class Problem7 {

	public static void main(String[] args) {
		
		int[] people = {3,10,23,45,50,60,24,29,31,32};
		int[] age = new int[7];
		
		for(int i=0;i<people.length;i++) {
			
			if(people[i]<10) {
				age[0]++;
			}else if(people[i]<20 && people[i]>=10) {
				age[1]++;
			}else if(people[i]<30 && people[i]>=20) {
				age[2]++;
			}else if(people[i]<40 && people[i]>=30) {
				age[3]++;
			}else if(people[i]<50 && people[i]>=40) {
				age[4]++;
			}else if(people[i]<60 && people[i]>=50) {
				age[5]++;
			}else if(people[i]<70 && people[i]>=60) {
				age[6]++;
			}
		}
		
		for(int i=0;i<age.length;i++) {
			
			System.out.println(age[i]);
		}
		

	}

}
