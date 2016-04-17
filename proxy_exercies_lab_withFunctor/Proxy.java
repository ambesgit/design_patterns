package proxy_exercies_lab_withFunctor;

import proxy_class_exercise.Thing;

public class Proxy implements proxy_class_exercise.Thing{
	
	IPrePostFunctor<String> f;
	Thing a;
	public Proxy(Thing a,IPrePostFunctor<String> f){
		this.a=a;
		this.f=f;
	}
	@Override
	public void compute(String string) {
				f.pre("Start");
				a.compute(string);
				f.post("End");
	}

}
