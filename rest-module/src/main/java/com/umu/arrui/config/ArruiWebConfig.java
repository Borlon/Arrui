package com.umu.arrui.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@ComponentScan(basePackages={"com.umu.arrui"})
@EnableWebMvc
public class ArruiWebConfig extends WebMvcConfigurerAdapter{

}
