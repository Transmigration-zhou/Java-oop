package c02.breakcontinue;

public class break�����ж�continue {
	public static void main(String[] args) {
		//aa();
		System.out.println();
		cc();
	}

	public static void aa() {
		boolean isPrime = true;// ������ʶÿ�μ�������Ƿ������������������Ϊfalse;
		for (int x = 2; x <= 100; x++) {
			isPrime = true;
			for (int i = 2; i < x; i++) {
				if (x % i == 0)
					isPrime = false;//
				continue;
			}
			if (isPrime == true) {
				System.out.print(x + "\t");
			}
		}
	}

	public static void bb() {
		boolean flags = false;
		for (int x = 2; x <= 100; x++) {
			flags = false;
			for (int i = 2; i < x; i++) {
				if (x % i == 0) {
					flags = true;//
					break;
				}
			}
			if (flags == false) {
				System.out.print(x + "\t");
			}
		}
	}

	public static void cc() {
	  out:for (int x = 100; x <= 200; x++) {
			for (int i = 2; i < x; i++) {
				if (x % i == 0) {
					
					
				}

				else {
					System.out.print(x + "\t");
					break;
				}
			}
			break;
		}
	}
}
