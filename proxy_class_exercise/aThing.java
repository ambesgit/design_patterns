package proxy_class_exercise;

public class aThing implements Thing{
	public aThing(String name){
		System.out.println(name);
		compute(name);
		
	}

	@Override
	public void compute(String string) {
		System.out.println(string+":compute");
		
	}
}
