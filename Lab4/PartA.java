//Makes a stack data type
import java.util.*;

//Array Stack
public class PartA{
	public PartA(){}
	public boolean push (Object a[], Object obj) throws Exception{
		try{
			if (isFull(a))
				throw new Exception();
			for (int i = 0; i < a.length; i++){
				if (a[i] == null){
					a[i] = obj;
					break;
				}
			}
		}
		catch (Exception e){
			System.out.print("Stack full ");
			return false;
		}
		return true;
	}

	public Object pop(Object a[]) throws Exception{
		Object obj = null;
		try{
			if (isEmpty(a))
				throw new Exception ();
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
		catch (Exception e){
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

	public Object top (Object a[]) throws Exception{
		Object top = null;
		try{
			if (isEmpty(a))
				throw new Exception ();
			for (int i = 0; i < a.length; i++){
				if (a[i] == null){
					top = a[i-1];
					break;
				}
			}
		}
		catch(Exception e){
			System.out.print("Stack is Empty ");
		}
		return top;
	}

	public static void main (String arg[]) throws Exception{
		Object a[] = new Object [3];
		PartA stacker = new PartA();
		System.out.println(stacker.push(a, 5));
		System.out.println(stacker.push(a, "adam"));
		System.out.println(stacker.push(a, 4.3));
		System.out.println(stacker.push(a, 4));
		System.out.println(stacker.pop(a));
		System.out.println(stacker.pop(a));
		System.out.println(stacker.pop(a));
		System.out.println(stacker.pop(a));
		System.out.println(stacker.top(a));

	}
}
