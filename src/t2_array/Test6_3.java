package t2_array;

import java.util.Date;
import java.util.Scanner;

//임포트 단축키 : 컨트롤 + 쉬프트+ 알파벳 o
public class Test6_3 {
	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println("now : " + now);
		
		Scanner sc = new Scanner(System.in);
		String yn = "";
		
		System.out.print("계속할까요?(Yes/No)");
		yn = sc.next();
		System.out.println("입력된 문자 : " + yn);
		
		for(int i=0; i<yn.length(); i++) {//문자열은 ==비교를 못한다 . 하려면 .equals로 해야한다/( 문자비교는 == , '' 사용)
			if(yn.equals("Y")) System.out.println("입력된 문자는 Y가 입니다.");
			else System.out.println("입력된 문자는 Y가 아닙니다~~~~");
		}
		
		
		sc.close();
	}
}
