package command_part2;
import java.util.Vector;

public class PushCommand implements ICommand{
	Mediator_Class mediator;	
	public PushCommand(){		
		this.mediator= Factory.getMediator();
	}	

	@Override
	public void execute() {
		 mediator.getGui().setPushString("");
		 mediator.getPushDialog().setVisible(true);
		 if (! mediator.getGui().getPushstring().equals("")) // after the dialog is closed, 
		    mediator.getStack().push( mediator.getGui().getPushstring());  // pushstring contains the user input  2		    	
		 	mediator.updateView();	
		
	}

	@Override
	public void unDo() {
		if(mediator.getStack().getSize()!=0){			
			mediator.getCommandManager().getHistory().push(mediator.getStack().pop());
			mediator.updateView();	
		}
		
	}

	@Override
	public void reDo() {
		if(mediator.getCommandManager().getHistory().getSize()!=0){
			mediator.getStack().push(mediator.getCommandManager().getHistory().pop());
			mediator.updateView();	
		}
		
	}

}
