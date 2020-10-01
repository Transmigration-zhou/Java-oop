package c02.breakcontinue;

public class TestContinue {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println("i的值是" + i);
			if (i == 1) {
				continue;
			}
			System.out.println("continue后的输出语句");
		}
	}
}
