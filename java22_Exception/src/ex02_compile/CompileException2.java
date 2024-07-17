package ex02_compile;
/*
 * 예외를 처리하는 방법 중 throws
 * 즉각적으로 예외를 처리하지 안혹 호출한 지점으로 예외를 던지는 방법
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileReading3{
	public void readFile(String fileName)throws FileNotFoundException, IOException{ //메소드 선언부에 던짐, 여러 개 던질 수 있음
		System.out.println("2. readFile calling...");
		FileReader reader = null;
		try {
			reader = new FileReader(fileName); //자원을 열었다
			
			System.out.println("파일을 성공적으로 찾았습니다");
		}finally {
			System.out.println("자원 반환...");
			reader.close();
		}
	}
}

public class CompileException2 {

	public static void main(String[] args) {
		System.out.println("1. FileReading 객체 생성...");
		FileReading3 fr = new FileReading3();
		try {
			fr.readFile("text.txt"); //여기로 폭탄 두 개가 날아옴	
		}catch(IOException e) {
			System.out.println("잡았다...");
		}
		System.out.println("3. 파일을 잘 읽어들였습니다...");
	}

}
