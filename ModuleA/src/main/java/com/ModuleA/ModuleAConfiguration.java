package com.ModuleA;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ModuleA")
public class ModuleAConfiguration {

  private static final Logger logger = LoggerFactory.getLogger(ModuleAConfiguration.class);

  @PostConstruct
  public void postConstruct(){
    logger.info("Module_A LOADED!");
  }

}