package state;

public class ShiftFour implements IShift{	
	private static final int shift =4;
	IShift shiftFife;
	IShift car;
	ShiftFour(IShift shifFife,IShift car){
		this.shiftFife=shifFife;
		this.car=car;
	}
	@Override	
	public int changeSpeed(int speed) {
		 if (speed >=40 && speed <55) {
             return 4;
         }
		return shiftFife.changeSpeed(speed);
	}

}
