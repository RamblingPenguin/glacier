package com.ramblingpenguin.glacier.lifecycle;

/**
 * Indicates that a component can be started.
 * <p>
 * This is typically the first phase of an active lifecycle, occurring after initialization (if applicable).
 */
public interface Startable {

    /**
     * Starts the component.
     *
     * @throws Exception if the component fails to start
     */
    void start() throws Exception;
}
