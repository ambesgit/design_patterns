package state;

public class ShiftTwo implements IShift{
	private static final int shift =2;
	IShift shiftThree;
	IShift car;
	 ShiftTwo(IShift shiftThree,IShift car){
		 this.shiftThree=shiftThree;
		 this.car=car;
	 }
	@Override
	public int changeSpeed(int speed) {
		  if (speed >= 10 && speed < 20) {
              return shift;
          }
		return shiftThree.changeSpeed(speed);
	}
	

}
