package iterator_j8;

import java.util.Iterator;
import java.util.Vector;

public class MyVector<T> extends Vector<T> {	
	public MyVector<Integer> myVector;
	 public <R> R  doAll(IFunctor<T,R> func){
		Iterator it=this.iterator();
		while(it.hasNext()){
			func.compute((T)it.next());
		}
		return func.getValue();
	}
	public <R> R doAll(IFunctor<T, R> func ,IPredicate p){		
		Iterator it=this.iterator();
		while(it.hasNext()){
			Integer element=(Integer)it.next();
			if(p.test(element)){
			func.compute((T)element);
			}
		}
		return func.getValue();
	}
	public Iterator<T> iterator(IPredicate predicate){
		myVector=new MyVector();
		Iterator it=this.iterator();
		Integer ob;
		while(it.hasNext()){
			ob=(Integer)it.next();
			if(predicate.test((Integer)ob)){
				myVector.add(ob);
			}
			
		}
		return (Iterator<T>) myVector.iterator();
	}
}
