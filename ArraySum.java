package array.app;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�迭 ũ�� �Է� > ");
		int size = input.nextInt();
		
		int score[] = new int[size];
		
		System.out.print("���� �Է� > ");
		for(int i = 0; i < score.length; i++)
			score[i] = input.nextInt();
		
		for(int value : score)
			System.out.print(value + " ");
	}

}
