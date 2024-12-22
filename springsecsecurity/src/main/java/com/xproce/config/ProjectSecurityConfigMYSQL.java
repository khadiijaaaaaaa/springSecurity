package com.xproce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;

@Configuration
public class ProjectSecurityConfigMYSQL {

    private final DataSource dataSource;

    public ProjectSecurityConfigMYSQL(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Bean
    public UserDetailsService userDetailsServices() {
        return new JdbcUserDetailsManager(dataSource);
    }
}