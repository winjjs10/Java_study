package mogaco;

	class calculator{
		int x;
		int y;
		
		public void printResult() {
			System.out.printf("%d + %d = %d\n", x,y,x+y);
			System.out.printf("%d - %d = %d\n", x,y,x-y);
			System.out.printf("%d * %d = %d\n", x,y,x*y);
			System.out.printf("%d / %d = %d\n", x,y,x/y);
			
		}
	}
	public class quiz10 {

		public static void main(String[] args) {
			calculator calculator = new calculator();
			calculator.x = 30;
			calculator.y = 50;
			calculator.printResult();
		}
	
	}


