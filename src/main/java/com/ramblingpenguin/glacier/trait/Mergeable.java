package com.ramblingpenguin.glacier.trait;

/**
 * Indicates that a component can be merged with another component by implementing this interface.
 */
public interface Mergeable {

    /**
     * The other component will be merged into this component.
     *
     * @param other
     * @param <TYPE>
     */
    public <TYPE extends Mergeable> void merge(TYPE other);
}
