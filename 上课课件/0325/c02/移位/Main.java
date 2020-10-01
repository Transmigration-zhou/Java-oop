package c02.移位;

//short、byte移位转int操作
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

		// JAVA进行移位运算中因为int是占32位,进行移位的数是32的模,
		// 所以当i<<32的时候就等于i<<0,相当于没有进行移位.

		System.out.println(1 << 32); // 结果为1
	}
}
