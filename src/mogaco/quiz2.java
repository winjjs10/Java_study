package mogaco;
import java.util.Scanner;	
public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ܾ �Է��ϼ���:");
		String W = sc.next();
		System.out.print("������ �Է��ϼ���:");
		int N = sc.nextInt();
		System.out.print("�Ǽ��� �Է��ϼ���:");
		float F = sc.nextFloat();
		System.out.print("������ �Է��ϼ���:");
		sc.nextLine();
		String S = sc.nextLine();
		System.out.println("�Է��� �͵��� ��� ��ƺ����?");
		System.out.printf("�ܾ�� %s, ������ %d, �Ǽ��� %f, ������ %s",W,N,F,S);
		
		sc.close();
		
	}

}
