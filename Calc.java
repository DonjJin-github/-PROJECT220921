/*2021041025 강희주
 * 사용자가 명령행에 입력한 여러 개의 실수를 main() 메소드에서 전달받아 합을 구하는 프로그램
 */
public class Calc {

	public static void main(String[] args) {
		double sum=0.0;
		
		for(int i=0;i<args.length;i++) //인자 개수만큼 반복
			sum+=Double.parseDouble(args[i]); //문자열을 double타입으로 변환하여 합산
		System.out.println("합계 :"+sum);

	}

}
