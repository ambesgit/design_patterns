package refactor_lab0_using_observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	public static List<IFrame> frames=new ArrayList<IFrame>();  
 
    public static void addFrameToList(IFrame iframe){
    	
    	frames.add(iframe);
    }   
    
    
}
