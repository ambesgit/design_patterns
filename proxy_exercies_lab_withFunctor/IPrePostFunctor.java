package proxy_exercies_lab_withFunctor;

public interface IPrePostFunctor<T> {
	void pre(T t);
	void post(T t);
}
