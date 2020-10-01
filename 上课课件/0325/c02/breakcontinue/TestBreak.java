package c02.breakcontinue;

public class TestBreak {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("iµÄÖµÊÇ" + i);
			if (i == 2) {
				break;
			}
		}
	}
}
