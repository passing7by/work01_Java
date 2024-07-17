package ex02_compile;

import java.io.FileNotFoundException;
import java.io.FileReader;

class FileReading{
	public void readFile(String fileName) {
		System.out.println("2. resdFril calling...");
		
		//자바에서 파일을 읽어들이기 위해서는 FileReader 객체를 생성해야 함
		try {
			FileReader reader = new FileReader(fileName);
			System.out.println("파일을 성공적으로 찾았습니다");
		}catch(FileNotFoundException e) {
//			System.out.println("파일을 찾지 못했습니다");
//			e.printStackTrace(); //예외가 발생한 자취를 따라가면서 에러메시지를 출력해 줌 (지금은 사용하지 않음(보안 문제에 취약))
			System.out.println(e);
		}
	}
}

public class CompileException3 {

	public static void main(String[] args) {
		System.out.println("1. FileReading 객체 생성...");
		FileReading fr = new FileReading();
		
		fr.readFile("text.txt");
		
		System.out.println("3. 파일을 잘 읽어들였습니다...");
	}

}
