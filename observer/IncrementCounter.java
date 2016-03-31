package refactor_lab0_using_observer_pattern;

public class IncrementCounter extends Counter implements ICounter{
	
	IState st;
	public IncrementCounter(IState s){
		
		st=s;
	}
	  public void increment(){
	     st.setCount(st.getCount()+1);
	    }

	@Override
	public void modify() {
		increment();
		notifyFrames();
	}
	@Override
	public void notifyFrames() {
		for(IFrame i:frames){
			i.setCount(st.getCount());//polymorphism dynamic binding
			
			
		}
		
	}
}
