package c02.breakcontinue;

public class TestBreak2 {
	public static void main(String[] args) {

		outer: for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.println("i��ֵΪ:" + i + "  j��ֵΪ:" + j);
				if (j == 1) {
					// ����outer��ǩ��ָ����ѭ����
					break outer;
				}
				System.out.println("xx1");
			}
			System.out.println("xx2");
		}
		System.out.println("xx3");
	}
}
