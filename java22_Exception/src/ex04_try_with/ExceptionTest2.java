package ex04_try_with;
import java.io.BufferedReader;
//try ~ with ~ resource 구문 활용하기
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * try문의 () 안에 자원을 열어서 생성하는 문장을 넣으면,
 * 자동으로 close()를 호출하지 않아도 try 블락을 벗어나는 순간 자동적으로 무조건 close()가 호출됨
 * 그런 다음에 차례로 catch 블럭이 수행됨
 * 만약, ()안에 다른 스트림을 생성해서 여러개를 넣을 수도 있음
 * ;으로 구분만 해 주면 됨
 */
public class ExceptionTest2 {

	public static void main(String[] args) throws IOException{
		try(FileWriter file = new FileWriter("data.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			file.write("Hello World");
			System.out.println("파일 출력...");
		}catch(IOException e) {
			System.out.println("잡았다...");
		}
	}
}


