package mogaco;
import java.util.Scanner;
public class quiz9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 5���� ����� �����Ͽ� �Է��ϼ���:");
		
		int[] num = new int[5];
		for (int a = 0; a<5; a++) {
			num[a] =  sc.nextInt();
		}
		
		for (int a = 4; a>= 0; a--) {
		System.out.println(num[a]);
		
		}
		sc.close();
	}

}
