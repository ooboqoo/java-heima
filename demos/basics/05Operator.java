class Operator {
	public static void main1(String[] args) {
		System.out.println(10 / 3);    // 3
		System.out.println(10 / 3.0);  // 3.3333333333333335
		System.out.println(9 % -5);    // 4
		System.out.println(-9 % -5);   // -4
	}

	public static void main2(String[] args) {
		int a1 = 3, a2 = 3;
		System.out.println(a1++);  // 3
		System.out.println(++a2);  // 4

		byte b =10;
		b++;           // 正常
		// b = b + 1;     // 报错
	}

	public static void main3(String[] args) {
		short s1 = 10, s2 = 10;
		// s1 = s1 + 1;  // 报错
		s2 += 1;      // 正常，相当于 s2 = (short) (s2 + 1);
	}

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		System.out.println(a < b & b < c);   // true & true  = true
		System.out.println(a < b & b > c);   // true & flase = false
		//System.out.println(a < b & 7);       // 操作数类型错误，& 是逻辑还是位运算符根据操作数来判断的
	}
}