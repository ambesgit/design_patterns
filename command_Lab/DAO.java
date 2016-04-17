package command_Lab;

public class DAO {
	public static PushDialog pushDialog;
	private DAO(){}	
	public static PushDialog getInputData(Lab5 lab4){
		if(pushDialog==null){
			pushDialog=new PushDialog(lab4);
			pushDialog.setVisible(true);
			return pushDialog;
		}
		pushDialog.setVisible(true);
		return pushDialog;
	}

}
