package com.ramblingpenguin.glacier.lifecycle;

/**
 * Indicates that a component can be configured.
 * <p>
 * This is often distinct from initialization, allowing configuration to be injected
 * separately from the startup process or updated dynamically.
 *
 * @param <CONFIG> the type of the configuration object
 */
public interface Configurable<CONFIG> {

    /**
     * Configures the component.
     *
     * @param config the configuration object
     * @throws Exception if configuration fails
     */
    void configure(CONFIG config) throws Exception;
}
