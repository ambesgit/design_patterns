package proxy_exercies_lab_withFunctor;

public class fThing implements IPrePostFunctor<String>{

	
	@Override
	public void pre(String pre) {
			System.out.println(pre);	
	}

	@Override
	public void post(String post) {
		
		System.out.println(post);
	}

}
