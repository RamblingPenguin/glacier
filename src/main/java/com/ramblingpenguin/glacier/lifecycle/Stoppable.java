package com.ramblingpenguin.glacier.lifecycle;

/**
 * Indicates that a component can be stopped.
 * <p>
 * This is typically the final phase of an active lifecycle.
 */
public interface Stoppable {

    /**
     * Stops the component.
     * <p>
     * Implementations should release resources and ensure a clean shutdown.
     *
     * @throws Exception if the component fails to stop cleanly
     */
    void stop() throws Exception;
}
