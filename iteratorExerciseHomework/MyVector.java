package iteratorExerciseHomework;

import java.util.Iterator;
import java.util.Vector;

public class MyVector<T> extends Vector<T> {	
	public MyVector<Integer> myVector;
	 public void  doAll(IFunctor<T> func){
		Iterator it=this.iterator();
		while(it.hasNext()){
			func.compute((T)it.next());
		}
		
	}
	public void doAll(IFunctor<T> func ,IPredicate p){		
		Iterator it=this.iterator();
		while(it.hasNext()){
			Integer element=(Integer)it.next();
			if(p.test(element)){
			func.compute((T)element);
			}
		}
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
