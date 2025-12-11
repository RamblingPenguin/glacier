package com.ramblingpenguin.glacier.lifecycle;

/**
 * Indicates that a component can be stopped, with an option to force termination.
 */
public interface ForceStoppable extends Stoppable {
    
    /**
     * Stops the component, optionally forcing termination.
     * 
     * @param force if {@code true}, the component should attempt to stop immediately, 
     *              potentially skipping graceful cleanup steps to ensure termination.
     * @throws Exception if the component fails to stop
     */
    void stop(boolean force) throws Exception;
}
