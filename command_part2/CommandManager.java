package command_part2;



import java.util.ArrayList;
import java.util.List;

import command_Lab.VStack;

public class CommandManager {
		private VStack history=new VStack();
		private Mediator_Class mediator;	
		private ICommand popCommand;
		private ICommand pushCommand;
		private ICommand currentCommand=pushCommand!=null?pushCommand:new PopCommand();
		
public CommandManager(){
	this.mediator= Factory.getMediator();
	popCommand=mediator.getPopCommand();
	pushCommand=mediator.getPushCommand();
}

	void actionPop(){
		currentCommand=popCommand;
		popCommand.execute();
		
		
	}
	void actionPush(){
		currentCommand=pushCommand;
		pushCommand.execute();
	}
	
	void unDo(){		
		currentCommand.unDo();
	}
	void reDo(){
		currentCommand.reDo();
	}

	public VStack getHistory() {
		return history;
	}

	public void setHistory(VStack history) {
		this.history = history;
	}
	
}
