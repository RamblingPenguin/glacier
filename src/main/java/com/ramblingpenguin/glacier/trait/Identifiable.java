package com.ramblingpenguin.glacier.trait;

/**
 * Indicates that an object has a unique identifier.
 *
 * @param <ID_TYPE> the type of the identifier
 */
public interface Identifiable<ID_TYPE> {
    
    /**
     * Retrieves the unique identifier of the object.
     *
     * @return the identifier
     */
    ID_TYPE id();
}