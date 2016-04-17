package command_part2;
public class Factory {	
	public static Mediator_Class mediator=null;
	private Factory(){}	
	public static Mediator_Class getMediator(){
		if(mediator==null){
			
			//the order is very important because objects created on the top 
			//are used objects to be created yet in the next line
			mediator=new Mediator_Class();
			mediator.setPushDialog(new PushDialog());
			mediator.setOkDialogCommand(new OKDialogCommand());
			mediator.setCancelDialogCommand(new CancelDialogCommand());
			mediator.setPopCommand(new PopCommand());		
			mediator.setPushCommand(new PushCommand());
			mediator.setStack(new VStack());
			mediator.setCommandManager(new CommandManager());
			
			return mediator;
		}
		
		return mediator;
	}

}
