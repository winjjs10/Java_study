package mogaco;
import java.util.Scanner;
public class quiz4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է��ϼ���:");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���:");
		int num2 = sc.nextInt();
		System.out.println("===��Ģ���� ����ϱ�===");
		System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
		System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
		System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
		System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
		System.out.printf("%d %% %d = %d\n",num1,num2,num1%num2);
		
		sc.close();
	}

}
