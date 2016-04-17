package state;

public class ShiftFife implements IShift {
	private static final int shift =5;
	IShift car;
	
	ShiftFife(IShift car){
		this.car=car;
	}
	@Override	
	
	public int changeSpeed(int speed) {
		 if (speed > 55 ) {
             return shift;
         }
		return shift;
	}
}
