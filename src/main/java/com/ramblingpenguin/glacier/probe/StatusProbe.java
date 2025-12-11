package com.ramblingpenguin.glacier.probe;

/**
 * A probe to check the status of a component.
 *
 * @param <STATUS> the type of the status object
 */
public interface StatusProbe<STATUS> {

    /**
     * Retrieves the current status of the component.
     *
     * @return the status
     */
    public STATUS status();
}