import java.util.Scanner;
public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("1000������ �ڿ����� �Է��ϼ���");
		int num1 = scan.nextInt();
		int sum = 0;
		int i = 1;
		while(i<=num1) {
			if(i%4 ==0) {
				System.out.print(i);
				sum += i;
			}
			i++;
		}
		System.out.print("1~" + num1 + "���� 4�� ����� ���� " + sum + "�Դϴ�.");
	}

}
