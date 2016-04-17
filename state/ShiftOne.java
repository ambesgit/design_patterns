package state;

public class ShiftOne implements IShift{
	
	private static final int shift =1;
	IShift shiftTwo;
	IShift car;
	 ShiftOne(IShift shiftTwo, IShift car){
		 this.shiftTwo=shiftTwo;
		 this.car=car;
	 }
	
	@Override
	public int changeSpeed(int speed) {		
		  if (speed > 0 && speed < 10) {
			  	return shift;
	        }
		return shiftTwo.changeSpeed(speed);
	}
}
