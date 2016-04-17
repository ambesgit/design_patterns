package command_part2;
public class OKDialogCommand implements ICommand{
	Mediator_Class mediator;	
	public OKDialogCommand(){		
		this.mediator= Factory.getMediator();
	}

	@Override
	public void execute() {

		mediator.getGui().setPushString(mediator.getPushDialog().JTextField.getText()); //make Lab4.pushstring equal to user input
		mediator.getPushDialog().dispose();	//close the dialog 
		
		
	}

	//unused methods 
	public void unDo() {}
	public void reDo() {}

}
