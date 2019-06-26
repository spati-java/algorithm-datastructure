public class StackXX {

	int maxSize = 0;
	String[] array;
	int top = 0;

	StackXX(int n) {

		this.maxSize = n;
		array = new String[this.maxSize];
		top = -1;
	}

	public String pop() {

		String s = array[top--];

		return s;

	}

	public String peek() {

		String s = array[top];
		return s;
	}

	public void push(String s) {

		array[++top] = s;
	}

	public boolean isEmpty() {

		return top == -1;
	}

	public boolean isFull() {

		return top == maxSize - 1;
	}

	public int stackSize() {

		return top + 1;
	}

	public static void main(String[] args) {

		StackXX stack = new StackXX(5);
		stack.push("Hello World");
		stack.push("Add more stuff to Stack");
		stack.push("item 3");
		stack.push("item 4");
		stack.push("item 5");

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isFull());
		System.out.println(stack.isEmpty());
		System.out.println(stack.stackSize());
		System.out.println(stack.pop());
	}

}