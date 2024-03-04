package t1_memory;

import java.util.Scanner;

public class Test1_3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//int ans = 0; // 1: 계속, 0:그만
		int cnt = 0;
		String ans = "N";
		
		while(true) {
			cnt++;
			System.out.println(cnt);
			System.out.print("작업을 계속할까요? (Y:계속 ,N:그만) ");
			ans = sc.next();
			//if(ans == "N")break;//참조타입은 == 연산자를 쓰면 안된다/ .equals(ans에 들어가서 주소를꺼내오는) 사용
			if(ans.equals("N"))break;
		}
		System.out.println("작업끝...");
		
		
		sc.close();
	}
}
