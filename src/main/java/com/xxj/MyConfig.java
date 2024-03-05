package com.xxj;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class to load Axe bean
 */
@Configuration
@ComponentScan(basePackages = {"com.xxj.beans", "com.xxj.spring02"})
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

    /**
     * Create a DruidDataSource java bean to application context
     *
     * @return a DruidDataSource object connected to my Azure Mysql database
     */
    @Bean
    public DruidDataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://frankdb.mysql.database.azure" +
                ".com:3306/zykczhsx4?serverTimezone=UTC&useSSL=true&requireSSL=false");
        druidDataSource.setUsername("frank");
        druidDataSource.setPassword("Xiao129129");
        return druidDataSource;
    }

}
