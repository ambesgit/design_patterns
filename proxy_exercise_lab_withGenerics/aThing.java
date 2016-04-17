package proxy_exercise_lab_withGenerics;

public class aThing implements Thing<String>{

	
	aThing(String s){
		System.out.println(s);
		compute(s);
	}
	@Override
	public void compute(String t) {
		System.out.println(t+":compute");
		
	}

}
