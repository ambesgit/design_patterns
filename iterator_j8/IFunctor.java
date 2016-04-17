package iterator_j8;

public interface IFunctor<T,R>{
	void compute(T element);
	R getValue();
}
