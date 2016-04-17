package proxy_exercise_lab_withGenerics;

public class bThing implements Thing<String>{
	bThing(String s){
		System.out.println(s);
		compute(s);
	}
	@Override
	public void compute(String t) {
		System.out.println(t+":compute");
		
	}

}
