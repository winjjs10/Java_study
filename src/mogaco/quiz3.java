package mogaco;
import java.util.Scanner;	
public class quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======�ڱ�Ұ� �Է��ϱ�======");
		System.out.print("�̸��� �Է��ϼ���:");
		String name = sc.next();
		System.out.print("���̸� �Է��ϼ���:");
		int age = sc.nextInt();
		System.out.print("�������� �Է��ϼ���:");
		String blood = sc.next();
		System.out.print("MBTI�� �Է��ϼ���:");
		String MBTI = sc.next();
		System.out.print("�¿�� �� ������ �Է��ϼ���:");
		sc.nextLine();
		String S = sc.nextLine();
		System.out.print("======�ڱ�Ұ� �Է� �Ϸ�======");
		System.out.print("\n\n���̿� �׶��� �ڱ�Ұ� ����! => �����Ϸ��� ���͸� ��������");
		sc.nextLine();
		System.out.printf("\n���� %s�Դϴ�. ���̴� %d���̿���.\n�������� %s���̱���, MBTI�� %s�Դϴ�.\n\n�ڡڡ�%s!!!!!!!�ڡڡ�",name,age,blood,MBTI,S);

		sc.close();
		
	}

}
