/*2021041025 강희주
 * do-while 문을 이용하여 'a'부터 'z'까지 출력하는 프로그램
 */
public class DoWhileSample {

	public static void main(String[] args) {
		char c='a';
		
		do {
			System.out.print(c);
			c=(char)(c+1);
			
		}while(c<='z');

	}

}
