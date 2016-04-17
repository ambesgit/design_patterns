package iteratorExerciseHomework;

public class Sum<T> implements IFunctor<Integer>{
	Integer sum=0;

	@Override
	public void compute(Integer element) {
		
		sum+=element;
	}

	@Override
	public Integer getValue() {
		
		return sum;
	}
	
	

}
