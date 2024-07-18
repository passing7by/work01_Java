package ex04_try_with;
import java.io.BufferedReader;
//try~with~resource구문 활용하기
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 try문 () 괄호 안에 자원을 열어서 생성하는 문장을 넣으면 자동으로 close()를 호출하지 않나도
 try블럭을 벗어나는 순간 자동적으로 close()가 호출된다.
 그런 다음에 catch블럭이 차례로 수행된다...
 만약에 ( )안에 다른 스트림 생성해서 여러개 넣을수도 있다. ;세미콜론으로 구분만 하면 된다.
 */
public class ExceptionTest2 {

	public static void main(String[] args){
		try(FileWriter file = new FileWriter("data.txt");
			BufferedReader  br = new BufferedReader(new InputStreamReader(System.in))) {		
			file.write("Hello World222");
			System.out.println("파일 출력.");
		}catch(IOException e) {
			System.out.println("잡았다.");
		}
	}

}
