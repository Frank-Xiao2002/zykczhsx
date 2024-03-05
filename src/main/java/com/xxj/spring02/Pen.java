package com.xxj.spring02;

import org.springframework.stereotype.Component;

/**
 * Pen pojo
 */
@Component
public class Pen {
    /**
     * name attribute
     */
    String name = "wanbaolong";

    /**
     * Pen's toString method
     *
     * @return a string representation of a Pen instance
     */
    @Override
    public String toString() {
        return "Pen{" +
                "name='" + name + '\'' +
                '}';
    }
}
