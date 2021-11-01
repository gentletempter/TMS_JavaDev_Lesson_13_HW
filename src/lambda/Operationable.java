package lambda;

@FunctionalInterface
public interface Operationable<T> {
    T process(T arg);
}
