package t2_array;

import java.util.Date;
import java.util.Scanner;

//임포트 단축키 : 컨트롤 + 쉬프트+ 알파벳 o
public class Test6_4 {
	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println("now : " + now);
		
		Scanner sc = new Scanner(System.in);
		String yn = "";
		
		System.out.print("계속할까요?(Yes/No)");
		yn = sc.next();
		System.out.println("입력된 문자 : " + yn);
		
		for(int i=0; i<yn.length(); i++) {//문자열을 문자로 
			if(yn.charAt(i) == 'Y') System.out.println("입력된 문자중 Y가 있습니다.");
			else System.out.println("입력된 문자중 Y가 없어요~~~~");
		}
		
		
		sc.close();
	}
}
