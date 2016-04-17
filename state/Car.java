package state;

public class Car implements IShift{
	IShift shiftFife;
	IShift shiftFour;
	IShift shiftThree;
	IShift shiftTwo;
	IShift shiftOne;
	IShift shiftPark;	
	public Car(){
		shiftFife=new ShiftFife(this);
		shiftFour=new ShiftFour(shiftFife,this);
		shiftThree=new ShiftThree(shiftFour,this);
		shiftTwo=new ShiftTwo(shiftThree,this);
		shiftOne=new ShiftOne(shiftTwo,this);
		shiftPark=new ShiftPark(shiftOne,this);	
		
	}

	
	@Override
	public int changeSpeed(int speed) {
		
		return shiftPark.changeSpeed(speed);
	}
   
}
    
