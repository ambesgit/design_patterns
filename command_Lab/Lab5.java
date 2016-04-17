package command_Lab;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/* ************************************
 *
 *  Lab4.  
 *
 * ************************************/

public class Lab5 extends javax.swing.JFrame{
	
     String pushstring="  "; // the string to push on the stack 
     CommandManager cManager; //command manager
	public Lab5 ()    
	{
		setTitle("Stack Application"); 
		setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(480,300);
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
		//Stack created
		VStack stack=new VStack();
		JScrollPane scrollPane = new JScrollPane(JList1);
		JList1.setListData(stack.getStackVector());
		scrollPane.setBounds(218,38,160,200);

		getContentPane().add(scrollPane);

		SymWindow aSymWindow = new SymWindow();
		this.addWindowListener(aSymWindow);
		SymAction lSymAction = new SymAction();

		JButtonPush.addActionListener(lSymAction);
		JButtonPop.addActionListener(lSymAction);
		JButtonUndo.addActionListener(lSymAction);
		JButtonRedo.addActionListener(lSymAction);
		
		//Create one command manager and add all the commands to the command manager
		
		cManager=new CommandManager();
		cManager.addpop(new PopCommand(this,stack,cManager));		
		cManager.addpush(new PushCommand(this,stack,cManager));
		
	
	}

	static public void main(String args[])
	{
		
			(new Lab5()).setVisible(true);
	
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
			if (object == Lab5.this)
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
				cManager.actionPush();
			else if (object == JButtonPop)
				cManager.actionPop();
			else if (object == JButtonUndo)
				cManager.unDo();
			else if (object == JButtonRedo)
				cManager.reDo();
			
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
	

}
