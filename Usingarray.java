package array.basic;

public class Usingarray {

	public static void main(String[] args) {
		//������ ���ڿ� ������ �迭�� ����
		String name[] = {"C++", "Java", "C#"};
		//for each ���Ƿ� ������ �迭�� ���
		for(String str : name)
			System.out.print(str + " ");
		System.out.println();
		
		//����� ���ڿ� ������ �迭�� ����
		String data[][] = {{"ȫ", "�浿"}, {"��", "��", "��"}, {"Tiger", "Woods"}};
		//for each ������ ������ �迭 ���
		for (String ary[] : data) {
			for (String value : ary)
				System.out.print(value + " ");
			System.out.println();
		}
	}
}
