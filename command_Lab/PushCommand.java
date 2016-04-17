package command_Lab;

import java.util.Vector;

public class PushCommand implements ICommand{
	VStack history;		
	private Lab5 lab4;
	private VStack stack;
	public PushCommand(Lab5 lab4,VStack stack,CommandManager manager){
		this.lab4=lab4;
		this.stack=stack;
		this.history=manager.history;
	}	

	@Override
	public void execute() {
		 lab4.pushstring= "";		  
		 	DAO.getInputData(lab4);//this is the access point to input data
		    if (!lab4.pushstring.equals("")) // after the dialog is closed, 
			   stack.push(lab4.pushstring);  // pushstring contains the user input
		    	//history.push(lab4.pushstring);
			lab4.JList1.setListData(stack.getStackVector());  // refresh the JList
			lab4.repaint();
		
	}

	@Override
	public void unDo() {
		if(stack.getSize()!=0){			
			history.push(stack.pop());
			lab4.JList1.setListData(stack.getStackVector());  // refresh the JList
			lab4.repaint();
		}
		
	}

	@Override
	public void reDo() {
		if(history.getSize()!=0){
			stack.push(history.pop());
			lab4.JList1.setListData(stack.getStackVector());  // refresh the JList
			lab4.repaint();
		}
		
	}

}
