package command_part2;

public class Mediator_Class {
	private GUI gui;
	private VStack stack;
	private ICommand popCommand;
	private ICommand pushCommand;
	private CommandManager commandManager;
	private PushDialog pushDialog;
	private ICommand okDialogCommand;
	private ICommand cancelDialogCommand;
	
	public GUI getGui() {
		return gui;
	}
	public void setGui(GUI gui) {
		this.gui = gui;
	}
	public VStack getStack() {
		return stack;
	}
	public void setStack(VStack stack) {
		this.stack = stack;
	}

	public void setPopCommand(PopCommand popCommand) {
		this.popCommand = popCommand;
	}

	public void setPushCommand(PushCommand pushCommand) {
		this.pushCommand = pushCommand;
	}
	public CommandManager getCommandManager() {
		return commandManager;
	}
	public void setCommandManager(CommandManager commandManager) {
		this.commandManager = commandManager;
	}
	public ICommand getPopCommand() {
		return popCommand;
	}
	public void setPopCommand(ICommand popCommand) {
		this.popCommand = popCommand;
	}
	public ICommand getPushCommand() {
		return pushCommand;
	}
	public void setPushCommand(ICommand pushCommand) {
		this.pushCommand = pushCommand;
	}
	public PushDialog getPushDialog() {
		return pushDialog;
	}
	public void setPushDialog(PushDialog pushDialog) {
		this.pushDialog = pushDialog;
	}
	public ICommand getOkDialogCommand() {
		return okDialogCommand;
	}
	public void setOkDialogCommand(ICommand okDialogCommand) {
		this.okDialogCommand = okDialogCommand;
	}
	public ICommand getCancelDialogCommand() {
		return cancelDialogCommand;
	}
	public void setCancelDialogCommand(ICommand cancleDialogCommand) {
		this.cancelDialogCommand = cancleDialogCommand;
	}
	
	//update the view
	
	void updateView(){
		getGui().JList1.setListData(getStack().getStackVector()); // refresh the JList
		getGui().repaint();
	}
}
