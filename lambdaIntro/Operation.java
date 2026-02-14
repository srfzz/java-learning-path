package lambdaIntro;

@FunctionalInterface
public interface Operation <T> {
	T operate(T valueOne,T valueTwo);

}
