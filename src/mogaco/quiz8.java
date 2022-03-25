package mogaco;
import java.util.Scanner;
public class quiz8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int num = sc.nextInt();
		int a = 1;
		int b = 0;
		while (a<=num) {
			b += a;
			System.out.printf("현재 %d입니다.\n",b);
			a++;
		}
		System.out.printf("%d부터 %d까지 합은 %d입니다.",1,num,b);
		
		sc.close();
		}	
	}


