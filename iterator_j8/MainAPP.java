package iterator_j8;

import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainAPP {

	public static void main(String[] args) {		
			MyVector<Integer> myVector=new MyVector<Integer>();			
			IPredicate<Integer> greaterThan2=new Predicate();
			//Insert values		
			int input=1;
			while(input<=10){
				myVector.add(input++);
				}
			myVector.stream();
			//1. Testing predicate 
			
			long x=myVector.stream().filter(r->greaterThan2.test((Integer)r)).count();
			System.out.println("checking the predictate: if pass result will be 8=:"+x);
			
			// 2. sum using java 8 stream's reduce method
		
			int sum=(int)myVector.stream().filter(el->greaterThan2.test((Integer)el)).reduce(0,(a,b)->(int)a+(int)b);
			
			System.out.println("Summ using reduce method: "+sum);
			
			//3. sum using java 8 stream's sum method
		
			double sumAgain=myVector.stream().filter(el->greaterThan2.test((Integer)el)).mapToInt(b->(int)b).sum();
			
			System.out.println("Summ using sum method: "+sumAgain);
			
			//4. average using java 8 stream's average method
		
			OptionalDouble avg=myVector.stream().filter(el->greaterThan2.test((Integer)el)).mapToInt(b->(int)b).average();
			
			System.out.println("Summ using sum method: "+avg);
			
		}
		
	
	

}
