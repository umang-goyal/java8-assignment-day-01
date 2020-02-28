package com.knoldus;

/**
 * Pentagon interface defines a pentagon shape.
 */

@FunctionalInterface
public interface Pentagon {
    /**
     * defines the side lengths of the shape and can be modified to perform any computation on them.
     * @param side1 length of side 1
     * @param side2 length of side 2
     * @param side3 length of side 3
     * @param side4 length of side 4
     * @param side5 length of side 5
     * @return integer value after any computation
     */

    int configuration(int side1, int side2, int side3, int side4, int side5);
}
