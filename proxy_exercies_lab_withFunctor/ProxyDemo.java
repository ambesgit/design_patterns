package proxy_exercies_lab_withFunctor;

import proxy_class_exercise.Thing;
import proxy_class_exercise.aThing;
import proxy_class_exercise.bThing;

public class ProxyDemo {

	public static void main(String[] args) {
		System.out.println("Test proxy with Functor");		
		Thing A=new aThing("A");
			A.compute("Hello");	
		IPrePostFunctor<String> prePost=new fThing();
			A=new Proxy(A,prePost);
			A.compute("Hello");
		Thing B=new bThing("B");
			B.compute("Hello");	
			B=new Proxy(B,prePost);
			B.compute("Hello");

	}

}
