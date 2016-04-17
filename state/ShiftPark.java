package state;

public class ShiftPark implements IShift{
	private static final int shift =0;
	IShift shiftOne;
	IShift car;
	ShiftPark(IShift shiftOne,IShift car){
		this.shiftOne=shiftOne;
		this.car=car;
	}
	@Override
	public int changeSpeed(int speed) {
		  if (speed == 0) {
			  	return shift;
		        
		    }
		return  shiftOne.changeSpeed(speed);
	}
	

}
