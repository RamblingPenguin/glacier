package com.ramblingpenguin.glacier.lifecycle;

/**
 * Indicates that a component requires initialization with a specific context.
 *
 * @param <CONTEXT> the type of the context object required for initialization
 */
public interface Initializable<CONTEXT> {

    /**
     * Initializes the component with the provided context.
     *
     * @param context the context required to initialize the component
     * @throws Exception if initialization fails
     */
    void initialize(CONTEXT context) throws Exception;
}
