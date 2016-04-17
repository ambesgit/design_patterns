package command_part2;



public class CancelDialogCommand implements ICommand{
	Mediator_Class mediator;
	
	public CancelDialogCommand(){
		this.mediator=Factory.getMediator();
	}
	@Override
	public void execute() {
	
			mediator.getPushDialog().dispose(); //close the dialog	
		
	}


	//unused methods 
	public void unDo() {}
	public void reDo() {}

}
