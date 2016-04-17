package command_part2;

import java.util.Vector;

public class PopCommand implements ICommand{	
	Mediator_Class mediator;
	
	public PopCommand(){		
		this.mediator= Factory.getMediator();
		
	}	

	@Override
	public void execute() {		
		mediator.getCommandManager().getHistory().push(mediator.getStack().pop());
		mediator.updateView();		
	}
	
	public void unDo(){
		if(mediator.getCommandManager().getHistory().getSize()!=0){
			mediator.getStack().push(mediator.getCommandManager().getHistory().pop());
			mediator.updateView();
		}
			
	}

	@Override
	public void reDo() {
		if(mediator.getStack().getSize()!=0){
			execute();
		}
		
	}

}
