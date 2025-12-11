package com.ramblingpenguin.glacier.probe;

/**
 * A probe to check if a component is ready to accept work.
 */
public interface ReadyProbe {

    /**
     * Checks if the component is ready.
     *
     * @return {@code true} if the component is ready, {@code false} otherwise
     * @throws Exception if the check fails
     */
    boolean ready() throws Exception;
}
