package command_Lab;

public class OKDialogCommand implements ICommand{
	
	PushDialog pushDialog;
	
	public OKDialogCommand(PushDialog pushDialog){
		this.pushDialog=pushDialog;
	}

	@Override
	public void execute() {

		pushDialog.parentframe.setPushString(pushDialog.JTextField.getText()); //make Lab4.pushstring equal to user input
		pushDialog.dispose();	//close the dialog 
		
		
	}

	//unused methods 
	public void unDo() {}
	public void reDo() {}

}
