
public class MyStack {
	//stack is FILO
	//first in
	//last out
	private Object[] items;
	private int top;
	private static int nonMagicNumber = 10;
	
	public MyStack(int size) {
		if (size < 1) {
			//FIXME maybe there is a better way
			size = nonMagicNumber;
		}
			items = new Object[size];
			top = 0;
	}
	public boolean isEmpty() {
		if (top == 0) {
			return true;
		}
		return false; //FIXME implement isEmpty
	}
	public boolean isFull() {
		//FIXME implement this method
		return top == items.length;
	}
	public Object pop() {
		if (isEmpty()) {
			return null;
		}
		Object r = items[top -1];
		--top;
		
		return r;
	}
	public boolean push(Object o) {
		if (isFull()) {
			return false;
		}
		else {
			items[top] = o;
			++top;
		}
		return true;
	}
	public void displayElements() {
		for (int i = 0; i < top; ++i) {
			System.out.println(items[top - i - 1]);
		}
	}
}
