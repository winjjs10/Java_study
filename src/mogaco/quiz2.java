package mogaco;
import java.util.Scanner;	
public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어를 입력하세요:");
		String W = sc.next();
		System.out.print("정수를 입력하세요:");
		int N = sc.nextInt();
		System.out.print("실수를 입력하세요:");
		float F = sc.nextFloat();
		System.out.print("문장을 입력하세요:");
		sc.nextLine();
		String S = sc.nextLine();
		System.out.println("입력한 것들을 모두 모아볼까요?");
		System.out.printf("단어는 %s, 정수는 %d, 실수는 %f, 문장은 %s",W,N,F,S);
		
		sc.close();
		
	}

}
