import java.util.Scanner;

public class HighLow {
	public static void main(String[] args) {
		System.out.println("나는 지금 0부터 100사이의 값 중에 하나를 생각하겠습니다." + '\n' + "당신은 그 숫자를 6회안에 맞추시면 됩니다");
		Scanner s = new Scanner(System.in);
		
		System.out.println("몇이라고 생각합니까?" + "<0 to 100> " );
		int num = s.nextInt(); 
	}
}
