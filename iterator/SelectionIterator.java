package iterator;

import java.util.Iterator;
import java.util.Vector;

public class SelectionIterator<T> implements Iterator<T>{
	public  MyList<T> data;
	int x=-1;	
	int age=0;
	public SelectionIterator(MyList<T> mylist,int a){
		data=mylist;		
		age=a;
	}
	@Override
	public boolean hasNext() {		
		
		while(x<data.size()){
			x++;
			if(age>=12){					
				
				break;
			}			
		}
		return x>=0 && x<data.size();
	}

	@Override
	public T next() {			
		
		return data.get(x);
	}
	

}
