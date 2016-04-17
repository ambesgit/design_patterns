package proxy_exercise_lab_withGenerics;
public class ProxyDemo {
		public static void main(String [] args){
			
			Thing<String> A=new aThing("A");
				A.compute("Hellow");
				A=new pThing<String>(A);
				A.compute("Hello");
			Thing<String> B=new bThing("A");
				B.compute("Hello");
				B=new pThing<String>(B);
				B.compute("Hello");
				
			
		}
}
