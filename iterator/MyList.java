package iterator;

import java.util.Iterator;
import java.util.Vector;

public class MyList<T> extends Vector<T>{
	
	public Iterator<T> reversIterator(){
		return new ReversIterator(this);
	}
	public Iterator<T> selectionIterator(int age){
		return new SelectionIterator(this,age);
	}
	public Iterator<T> fromJavaIterator(){
		return this.iterator();
	}
	
}
