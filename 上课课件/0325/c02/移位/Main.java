package c02.��λ;

//short��byte��λתint����
public class Main {
	public static void main(String[] args) {

		int i = -1;
		String ss = Integer.toBinaryString(i);
		System.out.println(ss);


		i >>>= 24;
		System.out.println(i); // 255

		int i2 = -1;
		i >>= 24;
		System.out.println(i2); // -1

		long l = -1;
		l >>>= 56;
		System.out.println(l); // 255

		short s = -1;
		s >>>= 24;
		System.out.println(s); // 255

		short s2 = -1;
		s2 >>>= 88;
		System.out.println(s2); // 255

		byte b = -1;
		b >>>= 10;
		System.out.println(b); // -1

		// JAVA������λ��������Ϊint��ռ32λ,������λ������32��ģ,
		// ���Ե�i<<32��ʱ��͵���i<<0,�൱��û�н�����λ.

		System.out.println(1 << 32); // ���Ϊ1
	}
}
