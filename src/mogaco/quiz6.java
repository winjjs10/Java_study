package mogaco;
import java.util.Scanner;
public class quiz6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 2���� �Է��ϼ���: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("�� �߿� ū ���� : ");
		System.out.println(a == b ? "����" : a > b? a : b);
		
		sc.close();
		
	}

}
