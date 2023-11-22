package core;

public interface iStack {
	boolean isEmpty();
	int getSize();
	void push(Object element);
	boolean isFull();
     Object top();
     Object pop();
}
