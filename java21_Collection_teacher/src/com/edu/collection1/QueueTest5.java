/*
 1. 먼저 들어간 자료가 먼저 나오는 구조 FIFO(First In FIrst Out) 구조 
 2. 큐는 한 쪽 끝은 프런트(front)로 정하여 삭제 연산만 수행함
 3. 다른 한 쪽 끝은 리어(rear)로 정하여 삽입 연산만 수행함  
 4. 그래프의 넓이 우선 탐색(BFS)에서 사용
 5. 컴퓨터 버퍼에서 주로 사용, 마구 입력이 되었으나 처리를 하지 못할 때, 버퍼(큐)를 만들어 대기 시킴
 
 offer | peek  | poll  |  remove  |  clear
 */
package com.edu.collection1;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest5 {

	public static void main(String[] args) {
		//Queue는 LinkedList를 이용해서 생성해야 한다.
		Queue<Integer> iqueue = new LinkedList<>();		
		
//		iqueue.add(1);  iqueue.add(2);  iqueue.add(3);
		iqueue.offer(1);  iqueue.offer(2);  iqueue.offer(3);
		System.out.println(iqueue);
		

		//queue에 들어있는 첫번째 값을 반환
		//비어있다면 null반환
		/*
		System.out.println(iqueue.poll());//1
		//iqueue.remove();//나중에 이부분 넣어서 다시 확인
		System.out.println(iqueue.poll());//2
		System.out.println(iqueue.poll());//3
		System.out.println(iqueue.poll());//null
		*/
		//iqueue.remove();//첫번째값 제거
		//System.out.println(iqueue);
		//iqueue.clear(); //queue의 모든 요소를 제거
		
		
		System.out.println(iqueue.peek()); //queue의 첫번쨰 값 참조
		System.out.println(iqueue.peek());
	}

}
