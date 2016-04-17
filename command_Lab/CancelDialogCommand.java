package command_Lab;

public class CancelDialogCommand implements ICommand{
	PushDialog pushDialog;
	
	public CancelDialogCommand(PushDialog pushDialog){
		this.pushDialog=pushDialog;
	}
	@Override
	public void execute() {
	
			pushDialog.dispose(); //close the dialog	
		
	}


	//unused methods 
	public void unDo() {}
	public void reDo() {}

}
