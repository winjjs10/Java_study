package mogaco;
import java.util.Scanner;	
public class quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======자기소개 입력하기======");
		System.out.print("이름을 입력하세요:");
		String name = sc.next();
		System.out.print("나이를 입력하세요:");
		int age = sc.nextInt();
		System.out.print("혈액형을 입력하세요:");
		String blood = sc.next();
		System.out.print("MBTI를 입력하세요:");
		String MBTI = sc.next();
		System.out.print("좌우명 한 문장을 입력하세요:");
		sc.nextLine();
		String S = sc.nextLine();
		System.out.print("======자기소개 입력 완료======");
		System.out.print("\n\n아이엠 그라운드 자기소개 시작! => 시작하려면 엔터를 누르세요");
		sc.nextLine();
		System.out.printf("\n저는 %s입니다. 나이는 %d살이에요.\n혈액형은 %s형이구요, MBTI는 %s입니다.\n\n★★★%s!!!!!!!★★★",name,age,blood,MBTI,S);

		sc.close();
		
	}

}
