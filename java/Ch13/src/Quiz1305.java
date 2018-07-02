import java.util.Scanner;

//( 0
//1.수업용 문서 - 06.입력글자 배열로 문서 참조 )
//회문(Palindrome)은 앞 or 뒤에서 읽어도 동일한 단어를 뜻한다.
//noon, level 과 같은 단어들이 회문에 속한다.
//사용자로부터 문자열을 입력받은후 회문인지 아닌지 판단하는 프로그램을 작성하시오.
//대소문자까지 동일해야 회문으로 인정함.
//출력예시)
//단어를 입력하시오. : noon
//회문입니다.
//단어를 입력하시오. : love
//회문이 아닙니다.

public class Quiz1305 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("단어를 입력해주세요");
		String word = s.next();

		String[] array_word = new String[word.length()]; // 스트링을 담을 배열

		for (int i = 0; i < array_word.length; i++) 
		{   // 스트링을 한글자씩 끊어 배열에 저장
			array_word[i] = Character.toString(word.charAt(i));
		}
		
		int nMax = array_word.length;
		int nMin = array_word.length/2;
		
		for (int i = 0; i < nMin; i++) 
		{
			if (!array_word[i].equals (array_word[nMax-1-i]) ) 
			{
				System.out.println("회문이 아닙니다.");
				return;
			}
		}
		System.out.println("회문입니다.");
	}
}	

		
//		// 출력 테스트용… 실제 사용시 안써도 됨.
//		for (int i = 0; i < array_word.length; i++) {
//			System.out.println(array_word[i]);
//
//		}
//
//	}
//}
