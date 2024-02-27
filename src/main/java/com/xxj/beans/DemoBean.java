package com.xxj.beans;

import org.springframework.stereotype.Component;

/**
 * DemoBean class is a class to verify {@linkplain org.springframework.context.annotation.ComponentScan ComponentScan}
 */
@Component
public class DemoBean {
    /**
     * DemoBean's name attribute
     */
    @SuppressWarnings("FieldCanBeLocal")
    private final String name = "Demo";

    /**
     * {@link com.xxj.beans.DemoBean} toString method
     *
     * @return string representation of {@link com.xxj.beans.DemoBean}
     */
    @Override
    public String toString() {
        return "DemoBean{" + "name='" + name + '\'' + '}';
    }
}
