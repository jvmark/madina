package com.duitang.madina.framework.context.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author mark
 * @since 2016-10-10 16:38.
 */
@Configuration
@EnableWebMvc
@EnableAspectJAutoProxy
@ComponentScan("com.duitang.madina.")
public class AppConfig extends WebMvcConfigurerAdapter {
}
