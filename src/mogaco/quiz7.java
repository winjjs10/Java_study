package mogaco;
import java.util.Scanner;
public class quiz7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==== ������ MBTI ������� ====");
		System.out.print("����� MBTI�� �Է��ϼ���: ");
		String mbti = sc.next();
		switch(mbti){
		case "intp" :
		case "INTP" :
			System.out.println("����� �鿣�����Դϴ�!");
			break;
		case "enfj" :
		case "ENFJ" :
			System.out.println("����� ����Ʈ�������Դϴ�!");
			break;
		case "infj" :
		case "INFJ" :
			System.out.println("����� Ǯ�������Դϴ�!");
			break;
		case "istj" :
		case "ISTJ" :
			System.out.println("����� �ۺ������Դϴ�!");
			break;
		case "entj" :
		case "ENTJ" :
			System.out.println("����� ��Ű�������Դϴ�!");
			break;
		case "isfj" :
		case "ISFJ" :
			System.out.println("����� �������������Դϴ�!");
			break;
		case "intj" :
		case "INTJ" :
			System.out.println("����� �����ͺм������Դϴ�!");
			break;
		case "enfp" :
		case "ENFP" :
			System.out.println("����� AI���Դϴ�!");
			break;
		case "entp" :
		case "ENTP" :
			System.out.println("����� iOS���Դϴ�!");
			break;
		case "esfj" :
		case "ESFJ" :
			System.out.println("����� �ȵ���̵����Դϴ�!");	
			break;
		case "esfp" :
		case "ESFP" :
			System.out.println("����� ���� ���������Դϴ�!");	
			break;
		case "estp" :
		case "ESTP" :
			System.out.println("����� IoT �������Դϴ�!");	
			break;
		case "estj" :
		case "ESTJ" :
			System.out.println("����� QA���Դϴ�!");
			break;
		case "infp" :
		case "INFP" :
			System.out.println("����� ���ü�����Դϴ�!");
			break;
		case "istp" :
		case "ISTP" :
			System.out.println("����� �Ӻ���� ���������Դϴ�!");
			break;
		case "isfp" :
		case "ISFP" :
			System.out.println("����� ��Ʈ��ũ ���������Դϴ�!");
			break;
		default:
			System.out.println("��Ȯ�� MBTI ������ �ƴϳ׿�Ф�");
		}
		sc.close();
	}
}
