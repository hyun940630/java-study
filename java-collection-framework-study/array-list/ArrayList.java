public class ArrayList {
	private int size = 0;
	private Object[] elementData = new Object[100];
	
	public ArrayList() {}
	
	// Add data to last position
	public boolean addLast(Object element) {
		elementData[size] = element;
		size++;
		return true;
	}
	
	// Add data to middle position
	public boolean add(int index, Object element) {
		// To add data in the middle of an element, move backward one element from the element at the end to the node at index
		for (int i = size - 1; i >= index; i--) {
			elementData[i + 1] = elementData[i];
		}
		
		// Add node to index
		elementData[index] = element;
		size++;	// Add space because element was added
		return true;
	}
	
	// Add data to first position
	public boolean addFirst(Object element) {
		return add(0, element);
	}
	
	// Remove data
	public Object remove(int index) {
		Object removed = elementData[index];
		for (int i = index + 1; i <= size - 1; i++) {
			elementData[i - 1] = elementData[i];
		}
		
		size--;
		elementData[size] = null;
		return removed;
	}
	
	// Remove data to first position
	public Object removeFirst() {
		return remove(0);
	}
	
	// Remove data to last position
	public Object removeLast() {
		return remove(size - 1);
	}
	
	// print Array List
	public String toString() {
		String str = "[";
		for (int i = 0; i < size; i++) {
			str += elementData[i];
			if (i < size - 1) {
				str += ", ";
			}
		}
		return str + "]";
	}
	
	// Get data
	public Object get(int index) {
		return elementData[index];
	}
	
	// size
	public int size() {
		return size;
	}
	
	// find the index of an element with a specific value
	public Object indexOf(Object o) {
		for (int i = 0; i < size; i++) {
			if (o.equals(elementData[i]))
				return i;
		}
		return -1;
	}
}
