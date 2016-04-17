package command_Lab;

import java.util.Vector;

public class PopCommand implements ICommand{
	
	
	VStack history;
	Lab5 lab4;
	VStack stack;
	public PopCommand(Lab5 lab4,VStack stack,CommandManager manager){	
		this.lab4=lab4;
		this.stack=stack;
		this.history=manager.history;
		
	}	

	@Override
	public void execute() {		
		history.push(stack.pop());
		lab4.JList1.setListData(stack.getStackVector()); // refresh the JList
		lab4.repaint();
	}
	
	public void unDo(){
		if(stack.getSize()!=0){
			history.push(stack.pop());
			lab4.JList1.setListData(stack.getStackVector()); // refresh the JList
			lab4.repaint();
		}
			
	}

	@Override
	public void reDo() {
		if(history.getSize()!=0){
			stack.push(history.pop());
			lab4.JList1.setListData(stack.getStackVector()); // refresh the JList
			lab4.repaint();
		}
		
	}

}
