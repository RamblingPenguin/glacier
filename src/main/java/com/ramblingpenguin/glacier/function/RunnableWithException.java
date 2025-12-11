package com.ramblingpenguin.glacier.function;

/**
 * A functional interface similar to {@link Runnable}, but allows throwing checked exceptions.
 */
@FunctionalInterface
public interface RunnableWithException {

    /**
     * Performs an action.
     *
     * @throws Exception if the action fails
     */
    void run() throws Exception;
}
