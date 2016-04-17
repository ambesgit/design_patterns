package command_Lab;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {	
	VStack history=new VStack();	
	List<ICommand> commands=new ArrayList<>();	
		private ICommand popCommand;
		private ICommand pushCommand;
		private ICommand currentCommand=popCommand;
	void addpop(ICommand popcommand){		
		popCommand=popcommand;
	}
	void addpush(ICommand pushcommand){		
		pushCommand=pushcommand;
		
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
}
