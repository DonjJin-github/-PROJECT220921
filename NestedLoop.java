/*2021041025 강희주
 * 2중 중첩 for문을 사용하여 구구단을 출력하는 프로그램
 */
public class NestedLoop {

	public static void main(String[] args) {
		for(int i=1;i<10;i++) { //1단에서 9단
			for(int j=1;j<10;j++) { //각 단의 구구단 출력
				System.out.print(i+"*"+j+"="+i*j);
				System.out.print('\t'); //하나씩 탭으로 띄움
			}
			System.out.println();
		}

	}

}
