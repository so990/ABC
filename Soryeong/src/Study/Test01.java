package Study;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int score = s.nextInt();
		
		if(score>=90) {
			System.out.println("A");
		}
		else if(score>=80&&score<90) {
			System.out.println("B");
		}
		else if(score>=70&&score<80) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}
	}
}
