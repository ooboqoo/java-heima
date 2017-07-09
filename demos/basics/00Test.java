class Test {
	public static void main(String[] args) {
		byte b1 = 3;
		byte b2 = 4;
		byte b3 = b1 + b2;  // 错误: 不兼容的类型: 从int转换到byte可能会有损失
		byte b4 = 3 + 4;
		System.out.println(b3);
	}
}