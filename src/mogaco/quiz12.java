package mogaco;
import java.util.Scanner;	
public class quiz12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] value = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		while (true) {
		try {
			System.out.print("���ڸ� �Է��ϼ���: ");
			int i = sc.nextInt();
			System.out.println(value[i]);
			System.out.println("���α׷� ����");
			break;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("0~9 ������ ���� �Է��ϼ���");
		   }
			
	    }
		
	}
}
