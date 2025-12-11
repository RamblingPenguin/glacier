package com.ramblingpenguin.glacier.lifecycle;

/**
 * Indicates that a component can reload its configuration or internal state.
 */
public interface Reloadable {

    /**
     * Reloads the component's configuration or state.
     * <p>
     * This allows the component to update itself without a full restart.
     *
     * @throws Exception if reloading fails
     */
    void reload() throws Exception;
}
