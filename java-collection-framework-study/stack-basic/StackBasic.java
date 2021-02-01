import java.util.Stack;

public class StackBasic {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(3);
		stack.push(2);
		stack.pop();	// �� ������ ��� ����
		stack.push(6);
		stack.push(8);
		
		// ���� �ֱٿ� ���� ��Ҹ� ���(���ñ����� ���� ����� ���)
		System.out.println(stack.peek());
		
		// �ش� ���� ���� ����� �΁��� ��ġ�� ���
		System.out.println(stack.search(6));
		
		// stack�� ���� ��� ��� ���(����ִ� ��Ҹ� �������� ���)
		while(stack.empty() == false)	// empty() �޼ҵ带 �̿��� ��� ��Ұ� stack���� ���Դ��� Ȯ��
			System.out.println(stack.pop());
	}
}