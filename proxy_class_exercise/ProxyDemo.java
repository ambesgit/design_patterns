package proxy_class_exercise;

public class ProxyDemo {

	public static void main(String[] args) {	
		//A   				Line 18
		//A	:compute    	line 18
		//Hello:compute		line 19
		//Start 			line 21
		//Hello:compute		line 21	
		//End				line 21
		//B					line 22
		//B:compute			line 22
		//Hello: compute	line 23
		//Start 			line 25
		//Hello:compute		line 25
		//End				line 25
		Thing A=new aThing("A");
			A.compute("Hello");
			A=new pThing(A);
			A.compute("Hello");
		Thing B=new bThing("B");
			B.compute("Hello");
			B=new pThing(B);
			B.compute("Hello");		
			
	}

}
