package com.ramblingpenguin.glacier.lifecycle;

/**
 * Indicates that a component can be temporarily paused and resumed.
 */
public interface Pausable {

    /**
     * Pauses the component's activity.
     * <p>
     * The component should remain alive but suspend its primary operations.
     *
     * @throws Exception if pausing fails
     */
    void pause() throws Exception;

    /**
     * Resumes the component's activity from a paused state.
     *
     * @throws Exception if resuming fails
     */
    void resume() throws Exception;
}
