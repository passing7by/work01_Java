package ex02_compile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileReading2{
	public void readFile(String fileName) {
		System.out.println("2. readFile calling...");		
		FileReader reader = null;
		try {
			reader = new FileReader(fileName);//자원을 열었다.
			
			System.out.println("파일을 성공적으로 찾았습니다.");
		} catch (FileNotFoundException e) {
			//System.out.println("파일을 찾지 못했습니다.");
			//e.printStackTrace();
			
			System.out.println(e+", catch");
		}finally {
			try {
				System.out.println("자원 반환..."); //출력된다..
				reader.close();
				
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		
	}
}
public class CompileExceptionTest2 {
	public static void main(String[] args) {
		System.out.println("1. FileReading 객체 생성...");
		FileReading2 fr = new FileReading2();
		
		fr.readFile("text.txt");
		
		System.out.println("3. 파일을 잘 읽어들였습니다..");

	}

}

























