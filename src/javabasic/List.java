package javabasic;

public abstract class List {
	protected int size;
	
	
	public int lenght() {
		return size;
	}
	
	public abstract void push(Object x);
	public abstract void pop();
}
