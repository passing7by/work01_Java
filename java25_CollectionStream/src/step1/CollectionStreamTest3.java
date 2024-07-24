package step1;
import java.util.Arrays;
import java.util.List;

public class CollectionStreamTest3 {

	public static void main(String[] args) {
		//직렬처리...main 쓰레드 혼자 작업
		/*
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		long start = System.currentTimeMillis();
		numbers.forEach(number -> {
		try {
			Thread.sleep(1000); //Thread : main
			System.out.println(number + ": " + Thread.currentThread().getName());
		} catch (InterruptedException e) {}	
		});
		long duration = (System.currentTimeMillis() - start);
		double seconds = duration / 1000.0;
		System.out.printf("Done in %.2f sec\n", seconds);
		 */
	
		//병렬처리
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		long start = System.currentTimeMillis();
		numbers.parallelStream().forEach(number -> { //parallelStream - List가 아니라면 parallel만 작성
		try {
			Thread.sleep(1000); //Thread : main
			System.out.println(number + ": " + Thread.currentThread().getName());
		} catch (InterruptedException e) {}	
		});
		long duration = (System.currentTimeMillis() - start);
		double seconds = duration / 1000.0;
		System.out.printf("Done in %.2f sec\n", seconds);

	}
}




