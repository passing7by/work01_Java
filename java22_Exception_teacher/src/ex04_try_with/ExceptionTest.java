package ex04_try_with;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        FileWriter file = null;
        try {
            file = new FileWriter("data.txt");
            file.write("Hello World");
        } catch (IOException e) {
        	System.out.println("IOE...1");
            throw new RuntimeException(e);
        } finally {
            try {
				file.close();
			} catch (IOException e) {	
				System.out.println("IOE...2");
				throw new RuntimeException(e);
			} 
        }
    }
}
