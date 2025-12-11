package com.ramblingpenguin.glacier.function;

/**
 * A functional interface similar to {@link java.util.function.Supplier}, but allows throwing checked exceptions.
 *
 * @param <T> the type of results supplied by this supplier
 */
@FunctionalInterface
public interface SupplierWithException<T> {

    /**
     * Gets a result.
     *
     * @return a result
     * @throws Exception if the supplier fails
     */
    T get() throws Exception;
}
