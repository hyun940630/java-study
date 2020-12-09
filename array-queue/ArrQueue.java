public class ArrQueue {
	private int front;
	private int rear;
	private int size;
	private Object[] arrQueue;
	
	public ArrQueue(int size) {
		this.front = 0;
		this.rear = -1;
		this.size = size;
		this.arrQueue = new Object[this.size];
	}
	
	// Queue �迭�� �� ���ִ��� Ȯ��
	public boolean isFull() {
		if (rear >= size - 1) return true;
		else return false;
	}
	
	// Queue �迭�� ����ִ��� Ȯ��
	public boolean isEmpty() {
		if (rear < front) return true;
		else return false;
	}
	
	// ���ϴ� �����͸� �߰��ϴ� �޼ҵ�
	public void enQueue(Object item) {
		if (isFull()) throw new ArrayIndexOutOfBoundsException();
		
		this.rear++;
		arrQueue[rear] = item;
	}
	
	// front�� ��ġ�� �����Ͱ� �������� Ȯ���ϴ� �޼ҵ�
	public Object peek() {
		return arrQueue[front];
	}
	
	// Queue�� front�� ������ ����
	public Object deQueue() {
		if (isEmpty()) throw new ArrayIndexOutOfBoundsException();
		
		Object backUpItem = peek();
		this.front++;
		return backUpItem;
	}
}
