class DataTypeConvension {
	// 强制类型转换
	public static void main1(String[] args) {
		int a = 10;
		byte b = 20;
		b = (byte)(a + b);
		System.out.println(b);
	}

	// 字符和字符串参与运算
	public static void main(String[] args) {
		System.out.println('a');               // a
		System.out.println('a' + 1);           // 98
		System.out.println((char) ('a' + 1));  // b

		System.out.println("hello" + 'a' + 1);  // helloa1
		System.out.println('a' + 1 + "hello");  // 98hello
		System.out.println("5 + 5 = " + 5 + 5);    // 5 + 5 = 55
		System.out.println("5 + 5 = " + (5 + 5));  // 5 + 5 = 10
	}
}
