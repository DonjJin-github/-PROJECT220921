/*2021041025 강희주
 * 두 정수를 입력 받아 나눗셈을 하고 몫을 구하는 프로그램 코드이다. 사용자가 나누는 수에 0
   을 입력하면 ArithmeticException 예외가 발생하여 프로그램이 강제 종료됨
 */
import java.util.Scanner;
public class DivideByZero {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int dividend; //나눠지는 수
		int divisor; //나누는 수
		
		System.out.print("나눠지는 수를 입력하시오:");
		dividend=scanner.nextInt(); 
		System.out.print("나누는 수를 입력하시오:");
		divisor=scanner.nextInt(); //나누는 수 입력
		System.out.println(dividend+"를"+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
		
		scanner.close();
	}

}
