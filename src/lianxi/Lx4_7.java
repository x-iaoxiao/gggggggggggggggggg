package lianxi;

public class Lx4_7 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		// 将一个数组中的元素逆序存放

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = a.length;
		int[] b = new int[n];
		for (int i = a.length - 1; i >= 0; i--) {
			b[i] = a[n-i-1];
		}
		for (int j = 0; j < b.length; j++)
			System.out.println(b[j]);
	}

}
