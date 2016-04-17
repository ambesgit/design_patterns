package iteratorExerciseHomework;

import java.util.Iterator;

public class MainAPP {

	public static void main(String[] args) {
		
			MyVector<Integer> myVector=new MyVector<Integer>();
			IFunctor<Integer> sumfunc=new Sum<Integer>();
			IFunctor<Integer> avgfunc=new Average<Integer>();
			IPredicate<Integer> testGreaterThanTwo=new Predicate();
			//Insert values		
			int x=1;
			while(x<20){
				myVector.add(x++);
				}	
			System.out.println();
			System.out.println("------External Complete Standard Java-----");		
			//-------This is external complete standard java way------------
			
			Iterator it=myVector.iterator();			
			Integer temp;
			while(it.hasNext()){
				temp=(Integer)it.next();
				sumfunc.compute(temp);
				avgfunc.compute(temp);
			}
			System.out.println("sum using External Complete : "+sumfunc.getValue());
			
			System.out.println("average using External Complete: "+avgfunc.getValue());
			
			
			//----------This is internal sum----------
			//---WE HAVE TO REST THE STATE OF THE FUNCTORS 
			//---OTHERWISE WE WILL ADD UP  ON TOP OF THE LAST RESULT
			System.out.println();
			System.out.println("------Internal Complete-----");		
			System.out.println(1);
			sumfunc=new Sum<Integer>();
			
			myVector.doAll(sumfunc);
			
			System.out.println("sum using Internal Complete: "+sumfunc.getValue());
			
			//---------This is internal average---------
			
			avgfunc=new Average<Integer>();// FOR THE SAME REASON LIKE THE TOP
			
			myVector.doAll(avgfunc);
			
			System.out.println("1b.");
			System.out.println("average using Internal Complete: "+avgfunc.getValue());		
			
			
			//-----------------External with Selection-----------------			
			MyVector<Integer> myVector2=new MyVector<Integer>();
			//insert 1 up to 10 
			int input=1;
			while(input<=10){
				myVector2.add(input++);
			}
			sumfunc=new Sum<Integer>();
			avgfunc=new Average<Integer>();
			Iterator selection=myVector2.iterator(testGreaterThanTwo);
			Integer temp2;
				while(selection.hasNext()){
					temp2=(Integer)selection.next();
					sumfunc.compute(temp2);
					avgfunc.compute(temp2);
				}
				System.out.println();
				System.out.println("------External With Selection -----");				
				System.out.println("2: sum");
				System.out.println("sum using External Selection : "+sumfunc.getValue());
				System.out.println("2: average");
				System.out.println("average using External Selection: "+avgfunc.getValue());
				
			//----------Internal Sum with selection-----------------------
			sumfunc=new Sum<Integer>();// FOR THE SAME REASON LIKE THE TOP(Reset)
			
			myVector2.doAll(sumfunc, testGreaterThanTwo);
			System.out.println();
			System.out.println("------Internal With Selection -----");			
			System.out.println("3: sum");
			System.out.println("sum using Internal Selection: "+sumfunc.getValue());
			
			//----------Internal Average with selection-----------------------
			avgfunc=new Average<Integer>();// FOR THE SAME REASON LIKE THE TOP(Reset)
			System.out.println("3: average");
			myVector2.doAll(avgfunc, testGreaterThanTwo);			
			System.out.println("Average using Internal Selection: "+avgfunc.getValue());
			
			
			
			
		}
			
	
	

}
