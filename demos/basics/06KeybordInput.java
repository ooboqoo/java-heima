import java.util.Scanner;

class KeybordInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a Integer:");
		int x = sc.nextInt();
		System.out.println(x);
		System.out.println("Input a String:");
		String s = sc.next();
		System.out.println(s);
	}
}
