package com.ramblingpenguin.glacier.observe;

/**
 * A generic listener interface for receiving events.
 *
 * @param <EVENT> the type of event to listen for
 */
@FunctionalInterface
public interface Listener<EVENT> {

    /**
     * Invoked when an event occurs.
     *
     * @param event the event object
     */
    void onEvent(EVENT event);
}
