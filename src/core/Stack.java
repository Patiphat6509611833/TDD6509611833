package core;

import java.util.ArrayList;

public class Stack implements iStack {
	private ArrayList<Object> elm = new ArrayList<Object>();
	

	

	@Override
	public boolean isEmpty() {
	
		return true;
	} 

	@Override
	public int getSize() {
		
		return 0;
	}
	
	@Override
	public Object top() {		
		
		return elm.get(elm.size()-1) ; 
	}
	
	@Override
	public boolean isFull() {
		
		return true; 
	}
	
	@Override
	public void push(Object element) {
		elm.add(element);
	}
	
	@Override
	public Object pop() {
		return elm.remove(elm.size()-1);
	}
}
