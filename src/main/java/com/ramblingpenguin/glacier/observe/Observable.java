package com.ramblingpenguin.glacier.observe;

/**
 * Indicates that an object can accept listeners.
 *
 * @param <LISTENER> the type of listener to accept
 */
public interface Observable<LISTENER> {

    /**
     * Adds a listener.
     *
     * @param listener the listener to add
     */
    void addListener(LISTENER listener);

    /**
     * Removes a listener.
     *
     * @param listener the listener to remove
     */
    void removeListener(LISTENER listener);
}
