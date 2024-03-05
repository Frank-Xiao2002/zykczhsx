package com.xxj.spring02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Person pojo
 */
@Component
public class Person {
    /**
     * person's name
     */
    @SuppressWarnings("FieldCanBeLocal")
    private final String name = "Frank Xiao";

    /**
     * the pen which the person uses
     */
    @Autowired
    Pen pen;

    /**
     * a method simulates the writing process
     */
    public void write() {
        System.out.println(name + " use " + pen + " to write");
    }
}
