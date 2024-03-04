package t1_memory;

public class Test4 {
	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = new String("홍길동"); //new를 사용해 새로운 객체 "홍길동"을 생성
		
		
		if(name1 == name2) System.out.println("name1과 name2는 같습니다.");
		else System.out.println("name1과 name2는 다릅니다.");//name1 홍길동의 주소값은 50 / name2홍길동의 주소값은80 = 그래서 다르다
		System.out.println();
		
		if(name1.equals("홍길동")) System.out.println("name1은 '홍길동'입니다.");
		else System.out.println("name1과 '홍길동' 아닙니다.");
		System.out.println();
		
		if(name1.equals(name2)) System.out.println("name1과 name2는 같습니다.");
		else System.out.println("name1과 name2는 다릅니다.");//같다 equals는 주소안에 들어있는 값을 비교(홍길동 / 홍길동)
		
	}
}
