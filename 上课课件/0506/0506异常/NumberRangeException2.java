package Òì³£;

public class NumberRangeException2 extends NumberFormatException {

	public NumberRangeException2() {
		super();
	}

	public NumberRangeException2(String msg) {
		super(msg);
	}

	public static String sum(String str1, String str2) {
		int int1 = Integer.parseInt(str1);
		int int2 = Integer.parseInt(str2);
		if ((int1 < 0) || (int1 > 20) || (int2 < 0) || (int2 > 20)) {
			throw new NumberRangeException2(
					"Numbers not within the specified range.");
		}
		return Integer.toString(int1 + int2);
	}

	public static void main(String[] args) {
		try {
			// String sum = sum(args[0], args[1]);
			String sum = sum("10", "30");
			System.out.println("½á¹û:" + sum);

		} catch (NumberRangeException2 e) {
			System.out.println("´íÎó£º" + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
