
public class ForinFor {

	public static void main(String[] args) {
//		for(int i = 0; i < 3; i++) {
//			System.out.println("----------------------");
//			for(int j = 0; j < 3; j++) {
//				System.out.print("[" + i + "," + j + "]");
//			}
//			System.out.print('\n');
//		}
		//������ ���
//		for(int i = 2; i < 10; i++) {
//			for(int j = 1; j < 10; j++)
//				System.out.println(i + "x" + j + "=" + (i*j));
//		}
		
		int x = 2;
		int y = 1;
		
		while((x < 10) && (y < 10)) {
			System.out.println(x+"x"+ y + "=" + (x * y));
			y++;
			
		}
	}
	
}
