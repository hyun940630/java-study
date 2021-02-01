import java.util.Stack;

public class StackBasic {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(3);
		stack.push(2);
		stack.pop();	// 맨 마지막 요소 삭제
		stack.push(6);
		stack.push(8);
		
		// 가장 최근에 들어온 요소를 출력(스택구조의 가장 꼭대기 요소)
		System.out.println(stack.peek());
		
		// 해당 값을 가진 요소의 인겍스 위치를 출력
		System.out.println(stack.search(6));
		
		// stack이 가진 모든 요소 출력(들어있는 요소를 역순으로 출력)
		while(stack.empty() == false)	// empty() 메소드를 이용해 모든 요소가 stack에서 나왔는지 확인
			System.out.println(stack.pop());
	}
}