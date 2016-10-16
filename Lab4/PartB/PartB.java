package PartB;

public class PartB {
	public PartB(){}

	public void process(Object a[], Object obj) throws Exception{
	int num1, num2;
		if (obj instanceof Integer)
			push (a, obj);
		else if (obj.equals("="))
			outputAnswer(a);
		else if (obj instanceof String){
			num1 = (Integer) pop(a);
			num2 = (Integer) pop(a);
			if (obj.equals("+"))
				push(a, (Object) (num1 + num2));
			else if (obj.equals("-"))
				push(a, (Object)(num1 - num2));
			else if (obj.equals("*"))
				push(a, (Object)(num1 * num2));
		}
	}

	public void push (Object a[], Object obj) throws StackFullException{
		try{
			if (isFull(a))
				throw new StackFullException();
			for (int i = 0; i < a.length; i++){
				if (a[i] == null){
					a[i] = obj;
					break;
				}
			}
		}
		catch (StackFullException e){
			System.out.print("Stack full ");
		}
	}

	public Object pop(Object a[]) throws StackEmptyException{
		Object obj = null;
		try{
			if (isEmpty(a))
				throw new StackEmptyException ();
			else if (isFull(a)){
				obj = a[a.length - 1];
				a[a.length - 1] = null;
			}
			else{
				for (int i = 0; i < a.length; i++){
					if (a[i + 1] == null){
						obj = a[i];
						a[i] = null;
						break;
					}
				}
			}
		}
		catch (StackEmptyException e){
			System.out.print("Stack is Empty ");
		}
		return obj;
	}

	public boolean isEmpty(Object a[]){
		if (a[0] == null)
			return true;
		return false;
	}

	public boolean isFull(Object a[]){
		if (a[a.length - 1] == null)
			return false;
		return true;
	}

	public Object top (Object a[]) throws StackEmptyException{
		Object top = null;
		try{
			if (isEmpty(a))
				throw new StackEmptyException ();
			for (int i = 0; i < a.length; i++){
				if (a[i] == null){
					top = a[i-1];
					break;
				}
			}
		}
		catch(StackEmptyException e){
			System.out.print("Stack is Empty ");
		}
		return top;
	}

	public void outputAnswer (Object a[]) throws Exception{
		System.out.println("Answer is " + top(a));
	}
	public static void main (String arg[]) throws Exception{
		Object a[] = new Object [10];
		PartB stacker = new PartB();
		stacker.process(a, 5);
		System.out.println(stacker.top(a));
		stacker.process(a, 3);
		stacker.process(a, 7);
		System.out.println(stacker.top(a));
		stacker.process(a, "+");
		stacker.process(a, "*");
		System.out.println(stacker.top(a));
		stacker.process(a, "=");
	}
}
