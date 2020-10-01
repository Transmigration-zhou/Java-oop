package c02.avsaa;

// 1、&和&&都有逻辑与功能，区别如下例；    
// 2、&还有位运算功能

public class Main {

	public static void main(String[] args) {

		int a = 4, b = 6;
		if (a < 1 & b++ > 0) {
			System.out.println(b);
		} else {
			System.out.println(b);
		}

		int x = 4, y = 6;
		if (x < 1 && y++ > 0) { // &&有短路功能
			System.out.println(y);
		} else {
			System.out.println(y);
		}

	}

}
