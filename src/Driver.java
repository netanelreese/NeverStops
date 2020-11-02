
public class Driver {

	public static void main(String[] args) {
		//TODO get me in exlipse
		System.out.println("GitHub!!!!!!!!!!!!!!!!!!!");
		System.out.println("Thiss was made in nano!!");
		
		MyStack ms = new MyStack(22);
		
		Integer i = 1;
		Integer i2 = 2;
		
		ms.push(i);
		ms.push(i2);
		
		Double d = 2.2;
		ms.push(d);
		
		ms.displayElements();
		
		SuperStack<String> stack = new SuperStack<String>(2);
		System.out.println(stack.peek());
		SuperStack<String> defaultStack = new SuperStack<String>();
		System.out.println(stack.peek());
		
	}

}
