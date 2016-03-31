package refactor_lab0_using_observer_pattern;

public class DecrementCounter extends Counter implements ICounter{	
	IState st;
	public DecrementCounter(IState s){
		st=s;
		
	}
	  public void decrement(){
		  if(st.getCount()>0)
			  st.setCount(st.getCount()-1);
		    }

		@Override
		public void modify() {
			decrement();
			notifyFrames();
		}

		@Override
		public void notifyFrames() {
			for(IFrame i:frames){
				i.setCount(st.getCount());
			}
			
		}

}
