package eclipseTutorial.main;

import eclipseTutorial.util.Counter;

public class Tester {

	public static void main(String[] args) {
		Counter counter = new Counter();
		int result = counter.count(15);
		if (result == 15) {
			System.out.println("Correct");
		} else {
			System.out.println("False");
		}
		try {
			counter.count(256);
		} catch (RuntimeException e) {
			System.out.println("Works as expected");
		}
	}

}
