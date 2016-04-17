package proxy_exercise_lab_withGenerics;

public class pThing<T> implements Thing<String>{
	Thing<String> a;
	pThing(Thing<String> a){
		this.a=a;
	}
	@Override
	public void compute(String t) {
				pre("Start");
				a.compute(t);
				post("End");
	}
	<T>void pre(T t){
		System.out.println(t);
	}
	<T> void post(T t){
		System.out.println(t);
	}
}
