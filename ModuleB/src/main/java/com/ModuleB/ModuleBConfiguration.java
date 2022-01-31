package com.ModuleB;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ModuleB")
public class ModuleBConfiguration {

  private static final Logger logger = LoggerFactory.getLogger(ModuleBConfiguration.class);

  @PostConstruct
  public void postConstruct(){
    logger.info("Module_B LOADED!");
  }

}