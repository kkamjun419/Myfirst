import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class D1_IOExceptionCase1 {

	public static void main(String[] args) {
		Path file = Paths.get("D:\\kkamjunstudy\\java\\Simple.txt");   //D:\\kkamjun\\study\\java\\Simple.txt 바른경로
		BufferedWriter writer = null;
		
		try {
		writer = Files.newBufferedWriter(file); //IOException 발생 가능
		writer.write('A');						//	IOException 발생 가능
		writer.write('Z');						// IOException 발생 가능
		
		if(writer != null)
			writer.close();                     //IOException 발생 가능
		}
		catch(IOException e) {              // Exception을 상속하는 예외는 반드시 처리를 해야 핚다.
			e.printStackTrace();            // 그렇지 않으면 컴파일 오류로 이어진다.
		}
	}

}
