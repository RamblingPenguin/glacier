package com.ramblingpenguin.glacier.lifecycle;

import com.ramblingpenguin.glacier.observe.Listener;

/**
 * Indicates that a component can be joined. Joining will cause the current thread to now block on the component.
 */
public interface Joinable {

    public void join() throws InterruptedException;
}
