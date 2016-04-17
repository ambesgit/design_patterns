package iteratorExerciseHomework;

public class Average<T> implements IFunctor<Integer>{
	Integer avg=0;
	Integer count=0;
	@Override
	public void compute(Integer element) {
		avg+=element;
		count++;
		
	}

	@Override
	public  Integer getValue(){
		Integer x=0;
		if(count!=0){
			return avg/count;
		}
		return x;
	}

	

}
