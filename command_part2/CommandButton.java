package command_part2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CommandButton extends JButton implements ActionListener{
	
	CommandManager cmd;
	
	public CommandButton(CommandManager cmd){
		this.cmd=cmd;
		this.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
			cmd.actionPush();	
	}

}
