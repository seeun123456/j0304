package t2_array;

//2차원배열(불규칙 값 저장)
/* 
  100 90 80 50
   80 50 90 100
   90 10 20 90
 
  */
public class Test11 {
	public static void main(String[] args) {
		int[][] atom = 
			{
				{100,90,80,50},
				{80,50,90,100},
				{90,10,20,90}
			}; //2차원
		
		// 값 기억시키기
		
		
		// 배열에 저장된 형태 그대로 출력하기
		for(int i=0; i<3; i++) {//행 = 가로줄 
			for(int j=0; j<4; j++) {//열 = 세로줄
				System.out.print(atom[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
