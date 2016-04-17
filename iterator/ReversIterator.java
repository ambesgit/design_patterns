package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ReversIterator <T> implements Iterator<T>{
	public  MyList<T> rel;
	int x;
	public ReversIterator(MyList<T> incommingdata){
		rel=incommingdata;		
		x=rel.size()-1;
	}
	
	
	Swimmer sw;
	@Override
	public boolean hasNext() {
		
		return x>=0;
	}

	@Override
	public T next() {		
		return rel.get(x--);
	}


}
