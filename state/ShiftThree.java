package state;

public class ShiftThree implements IShift{
	
	private static final int shift =3;
	IShift shiftFour;
	IShift car;
	ShiftThree(IShift shiftFour,IShift car){
		this.shiftFour=shiftFour;
		this.car=car;
	}
	@Override
	public int changeSpeed(int speed) {
		  if (speed >= 20 && speed < 40) {
              return shift;
          }
		return shiftFour.changeSpeed(speed);
	}


}
