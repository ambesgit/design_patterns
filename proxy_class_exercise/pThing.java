package proxy_class_exercise;

public class pThing implements Thing{
	Thing a;
	pThing(Thing a){
		this.a=a;
	}
	@Override
	public void compute(String string) {	
		pre("Start");
		a.compute(string);
		post("End");
		
	}
	void pre(String string ){
		System.out.println(string);
	}
	void post(String string){
		System.out.print(string);
	}
}
