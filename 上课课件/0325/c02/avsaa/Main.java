package c02.avsaa;

// 1��&��&&�����߼��빦�ܣ�������������    
// 2��&����λ���㹦��

public class Main {

	public static void main(String[] args) {

		int a = 4, b = 6;
		if (a < 1 & b++ > 0) {
			System.out.println(b);
		} else {
			System.out.println(b);
		}

		int x = 4, y = 6;
		if (x < 1 && y++ > 0) { // &&�ж�·����
			System.out.println(y);
		} else {
			System.out.println(y);
		}

	}

}
