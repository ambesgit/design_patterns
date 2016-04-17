package command_part2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/* ************************************
 *
 *  Lab4.  
 *
 * ************************************/

public class GUI extends javax.swing.JFrame{
	
     String pushstring="  "; // the string to push on the stack      
     Mediator_Class mediator;
     javax.swing.JButton cButton;
	public GUI ()    
	{
		//add mediator and set the refrence to this GUI object
		this.mediator= Factory.getMediator();	
		mediator.setGui(this);	
		setTitle("Stack Application"); 
		setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(480,350);
		setVisible(false);

		JButtonPush.setText("Push");
		getContentPane().add(JButtonPush);
		JButtonPush.setBounds(38,48,110,30);

		JButtonPop.setText("Pop");
		getContentPane().add(JButtonPop);
		JButtonPop.setBounds(38,98,110,30);

		JButtonUndo.setText("Undo");
		getContentPane().add(JButtonUndo);
		JButtonUndo.setBounds(38,144,110,30);

		JButtonRedo.setText("Redo");
		getContentPane().add(JButtonRedo);
		JButtonRedo.setBounds(38,190,110,30);
		
		//commandButton with actionlistener cappablity
		cButton = new CommandButton(mediator.getCommandManager());
		cButton.setText("cmdPush");
		getContentPane().add(cButton);
		cButton.setBounds(38,246,110,30);
		
		JScrollPane scrollPane = new JScrollPane(JList1);
		JList1.setListData(mediator.getStack().getStackVector());
		scrollPane.setBounds(218,38,160,200);

		getContentPane().add(scrollPane);

		SymWindow aSymWindow = new SymWindow();
		this.addWindowListener(aSymWindow);
		SymAction lSymAction = new SymAction();

		JButtonPush.addActionListener(lSymAction);
		JButtonPop.addActionListener(lSymAction);
		JButtonUndo.addActionListener(lSymAction);
		JButtonRedo.addActionListener(lSymAction);
	
		
	
	}

	static public void main(String args[])
	{
		
			(new GUI()).setVisible(true);
	
	}


	//
	javax.swing.JButton JButtonPush = new javax.swing.JButton();
	javax.swing.JButton JButtonPop = new javax.swing.JButton();
	javax.swing.JButton JButtonUndo = new javax.swing.JButton();
	javax.swing.JButton JButtonRedo = new javax.swing.JButton();	
	javax.swing.JList JList1 = new javax.swing.JList();
	//

	void exitApplication()
	{
		try {
		    	this.setVisible(false);    // hide the Frame
		    	this.dispose();            // free the system resources
		    	System.exit(0);            // close the application
		} catch (Exception e) {
		}
	}

	class SymWindow extends java.awt.event.WindowAdapter
	{
		public void windowClosing(java.awt.event.WindowEvent event)
		{
			Object object = event.getSource();
			if (object == GUI.this)
				JFrame1_windowClosing(event);
		}
	}

	void JFrame1_windowClosing(java.awt.event.WindowEvent event)
	{
		// to do: code goes here.
			 
		JFrame1_windowClosing_Interaction1(event);
	}

	void JFrame1_windowClosing_Interaction1(java.awt.event.WindowEvent event) {
		try {
			this.exitApplication();
		} catch (Exception e) {
		}
	}

	class SymAction implements java.awt.event.ActionListener
	{
		public void actionPerformed(java.awt.event.ActionEvent event)
		{
			Object object = event.getSource();
			if (object == JButtonPush)
				mediator.getCommandManager().actionPush();
			else if (object == JButtonPop)
				mediator.getCommandManager().actionPop();
			else if (object == JButtonUndo)
				mediator.getCommandManager().unDo();
			else if (object == JButtonRedo)
				mediator.getCommandManager().reDo();
			
		}
	}




	void JButtonUndo_actionPerformed(java.awt.event.ActionEvent event)
	{
		// to do: code goes here.
			 
	}

	void JButtonRedo_actionPerformed(java.awt.event.ActionEvent event)
	{
		// to do: code goes here.
			 
	}
	
	public void setPushString (String string){
	    pushstring = string;
	}

	public String getPushstring() {
		return pushstring;
	}

	
	

}
