package refactor_lab0_using_observer_pattern;

public class State implements IState{
	private static int count=0;

	@Override
	public void setCount(int ct) {
		count=ct;
		
	}

	@Override
	public int getCount() {
		
		return count;
	}
	
	
	
}
