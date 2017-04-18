package array.basic;

public class Arraycopy {

	public static void main(String[] args) {
		int[] copyFrom = {1, 2, 3, 4, 5, 6, 7};
		int[] copyTo = {10, 20, 30, 40, 50, 60, 70, 80};
		System.arraycopy(copyFrom, 4, copyTo, 1, 3);
		
		for(int i = 0; i < copyFrom.length; i++)
			System.out.print(copyFrom[i] + " ");
		System.out.println();
		
		for (int value : copyTo)
			System.out.print(value + " ");
		
		int[] a = {5,6,7,8,9,10};
		int[] b = {10, 20, 30, 40, 50, 60};
		System.arraycopy(a, 2, b, 3, 3);
		
		System.out.println();
		for (int value2 : b)
			System.out.print(value2 + " ");

	}

}
