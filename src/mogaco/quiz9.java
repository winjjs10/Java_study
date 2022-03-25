package mogaco;
import java.util.Scanner;
public class quiz9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 5개를 띄어쓰기로 구분하여 입력하세요:");
		
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
