package com.xxj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class to load Axe bean
 */
@Configuration
public class MyConfig {
    /**
     * Create Axe java bean
     *
     * @return Axe bean
     */
    @Bean
    public Axe axe() {
        return new Axe();
    }
}
