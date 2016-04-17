package command_part2;

import java.util.*;

public class VStack{
	
	Mediator_Class mediator;
   private Vector stackvector;  
   
   public VStack(){
	   
	  //get the mediator and set reference to this VStact object
	   this.mediator= Factory.getMediator();
	   mediator.setStack(this);
	   
	   stackvector= new Vector();
      
   }
   
   public void push(Object obj){
      stackvector.insertElementAt(obj,0);
   }
   
   public Object pop(){
      if (stackvector.size()>0){
         Object obj =stackvector.firstElement();
         stackvector.removeElementAt(0);
         return obj;
      }
         else
         return null;
   }
   
   public int getSize(){
      return stackvector.size();
   }
   
   public Vector getStackVector(){
      return stackvector;
   }
    
}
