/**
 * 
 */
package com.springio.basic.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author ardhani
 *
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.springio.basic")
public class AppConfiguration {

}
