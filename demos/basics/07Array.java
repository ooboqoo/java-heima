import java.util.Arrays;
class Array {
	public static void main(String[] args) {
		int[] x, y[];
		y = new int[3][];
		y[0] = new int[3];
		y[1] = new int[] {1, 2 , 3 , 4, 5};
		System.out.println(Arrays.toString(y));
		System.out.println(Arrays.toString(y[0]));
		System.out.println(Arrays.toString(y[1]));
	}
}